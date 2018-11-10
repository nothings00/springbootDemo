import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zenghh on 2018-08-28.
 */
@RestController
@EnableAutoConfiguration
public class Example {
    @RequestMapping("/")
    String home(){
        return "hello world!2222";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class,args);
    }
}
