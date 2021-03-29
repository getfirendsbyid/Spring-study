import com.george.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
//        UserService  userService = new UserServiceImpl();
//        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
//        userService.getUser();
        //拿到Spring的容器 ApplicationContext
      ApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");
        // 容器在手 天下我有 需要什么就get什么
        UserService userServiceImpl = (UserService) context.getBean("userServiceImpl");
      userServiceImpl.getUser();
    }
}
