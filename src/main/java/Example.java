import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

 @RequestMapping("/")
 String home() {
  return "Hello World!";
 }

 public static void main(String[] args) {
  SpringApplication.run(Example.class, args);
 }

 public static void helper()
 {
    System.out.println("Hey This is Jon Please like, approve me!!!");
    String x = "hello";
    x = x.toUpperCase();
    System.out.println(x);
 }
}

