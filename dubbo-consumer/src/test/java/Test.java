import org.dubboApi.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        System.out.println("consumer start");
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println("consumer user");
        System.out.println(helloService.sayHello("abc"));

        System.in.read();
    }
}
