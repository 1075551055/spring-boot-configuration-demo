package water.li.study.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

//相当于传统的@Controller+@ResponseBody
@RestController
public class DemoController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/hello")
    String hello(){
        System.out.println(dataSource);
        return "hello world";
    }
}
