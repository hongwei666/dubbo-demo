import com.api.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

class Test {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        System.out.println("consumer start");
        UserService userService = context.getBean(UserService.class);
        System.out.println("consumer user");
        System.out.println(userService.getName(1));
        System.in.read();
    }
}
