import com.api.ProductService;
import com.dto.Product;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

class GetProductTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("consumer start");
        ProductService productService = context.getBean(ProductService.class);
        System.out.println("consumer user");
        List<Product> l =productService.getProduct();
        System.out.println(l);
        System.in.read();
    }
}