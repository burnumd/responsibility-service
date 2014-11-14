package notification;

import java.util.ArrayList;
import java.util.List;

public class Notification {
    private String title = "";
    private String message = "";
    private List<String> recipients = new ArrayList<String>();
    private List<String> ccs = new ArrayList<String>();
    private String from = "fraferna@iu.edu";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    public List<String> getCcs() {
        return ccs;
    }

    public void setCcs(List<String> ccs) {
        this.ccs = ccs;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
