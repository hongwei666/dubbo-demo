import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

class Test {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(context.getDisplayName()+":here");
        context.start();
        System.out.println("Provider start");
        System.in.read();
    }
}
