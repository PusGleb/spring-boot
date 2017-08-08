package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hleb_Pus on 8/7/2017.
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {


        String hello = "DEBUG";
        System.out.println("hello");
        System.out.println(hello);

        return "Greetings from Spring Boot!";
    }

}
