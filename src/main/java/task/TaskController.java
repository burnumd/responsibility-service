package task;

import notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
public class TaskController {

    private String notificationEndpoint = "http://140.182.72.35:8083/notifications";

    @Autowired
    private TaskRepository repository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Task getActivity(@PathVariable String id) {
        return repository.findOne(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public String create(@RequestBody Task task) {
        String taskId = repository.save(task).getId();
        Notification notification = new Notification();
        notification.setTitle("Workflow Notification");
        List<String> recipients = new ArrayList<String>();
        recipients.add(task.getRecipient());
        notification.setRecipients(recipients);
        notification.setMessage("You have a task to complete.");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(notificationEndpoint, notification, String.class);
        return taskId;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@PathVariable String id, @RequestBody String status) {
        Task toUpdate = repository.findOne(id);
        toUpdate.setStatus(status);
        return repository.save(toUpdate).getId();
    }
}
