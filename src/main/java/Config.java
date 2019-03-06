import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: LiYongSen[825760990@qq.com]
 * @create: 2019-03-06 16:28
 **/
@Configuration
public class Config {
    @Bean
    public User user() {
        User user = new User();
        user.setId("11111111111");
        return user;
    }
}
