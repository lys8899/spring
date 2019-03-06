import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: LiYongSen[825760990@qq.com]
 * @create: 2019-03-06 16:07
 **/
public class StartMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
        User bean = applicationContext.getBean(User.class);
        System.out.println(bean);

    }

}
