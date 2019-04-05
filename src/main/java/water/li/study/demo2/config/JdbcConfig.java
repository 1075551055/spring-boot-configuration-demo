package water.li.study.demo2.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


@Configuration
//使用JdbcProperties
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {


    //在方法上通过Bean注解让spring返回DataSource. spring获取这个bean的时候会自动注入jdbcProperties
    @Bean
    public DataSource dataSource(JdbcProperties jdbcProperties){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUserName());
        dataSource.setPassword(jdbcProperties.getPassword());
        return dataSource;
    }
}
