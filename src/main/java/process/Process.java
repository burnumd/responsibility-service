package process;

import org.springframework.data.annotation.Id;

public class Process {

    @Id
    private String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
