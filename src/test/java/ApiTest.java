import bean.UserService;
import org.example.BeansException;
import org.example.factory.config.BeanDefinition;
import org.example.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @Author FuWenhao
 * @Date 2023 03 06
 **/
public class ApiTest {
    @Test
    public void testBeanFactory() throws BeansException {
        // 1、初始化bean
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2、注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3、第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4、第二次获取bean，从单例中获取
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
}
