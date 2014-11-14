package task;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Task extends process.Process {
    private String status = "IN PROCESS";
    private String recipient;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}
