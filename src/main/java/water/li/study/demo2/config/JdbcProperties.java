package water.li.study.demo2.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

//读取classpath下面的application.properties文件，并设置到JdbcProperties中.前缀为jdbc，否则属性match不上
@ConfigurationProperties(prefix = "jdbc")
//使用Lombok插件在编译class的时候自动为属性生成set和get
@Data
public class JdbcProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
