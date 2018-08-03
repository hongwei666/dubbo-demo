import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

class ProductProvider {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("Provider start");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}