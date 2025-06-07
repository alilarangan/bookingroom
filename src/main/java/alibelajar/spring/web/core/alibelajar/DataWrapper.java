package alibelajar.spring.web.core.alibelajar;

import alibelajar.spring.web.core.alibelajar.model.User;

import java.util.List;

public class DataWrapper {

    private List<User> content;

    public List<User> getContent() {
        return content;
    }

    public void setContent(List<User> content) {
        this.content = content;
    }
}
