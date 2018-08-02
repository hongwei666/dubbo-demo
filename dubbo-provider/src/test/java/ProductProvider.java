import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class ProductProvider {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(context.getDisplayName()+":here");
        context.start();
        System.out.println("Provider start");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
