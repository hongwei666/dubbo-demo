import com.api.ProductService;
import com.dto.Product;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class GetProductTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        System.out.println("consumer start");
        ProductService productService = context.getBean(ProductService.class);
        System.out.println("consumer user");
        List<Product> l =productService.getProduct();
        Product p = l.get(0);
        System.out.println(p.toString());
        System.in.read();
    }
}
