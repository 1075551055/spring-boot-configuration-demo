package water.li.study;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//该注解让spring基于你的依赖去猜测你要如何配置spring.因为之前在POM里加了spring-boot-starter-web这个starter，
// 所以也就加入了Tomcat和Spring MVC，自动配置(Auto-configuration)机制就会假设你要开发一个web应用，然后帮你配置好Spring。
@EnableAutoConfiguration
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }
}
