package responsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/responsibilities")
public class ResponsibilityController {

    @Autowired
    private ResponsibilityRepository repository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Responsibility getActivity(@PathVariable String id) {
        return repository.findOne(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public String create(@RequestBody Responsibility responsibility) {
        return repository.save(responsibility).getId();
    }
}
