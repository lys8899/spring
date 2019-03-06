import org.springframework.stereotype.Component;


/**
 * @description: 用户
 * @author: LiYongSen[825760990@qq.com]
 * @create: 2019-03-06 16:04
 **/
@Component
public class User {
    private String id;
    private String name;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
