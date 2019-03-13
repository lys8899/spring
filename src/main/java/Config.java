import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import postprocessors.Mypricess1;

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

    @Bean
    public Mypricess1 mypricess1() {
        return new Mypricess1();
    }
}
