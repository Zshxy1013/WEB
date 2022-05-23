package config;

import org.aspectj.lang.annotation.After;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//配置类
@Configuration
//导入第三方bean
//@Import({JdbcConfig.class,MybatisConfig.class})
//引入资源文件
//@PropertySource("classpath:jdbc.properties")
//spring配置类扫描
@ComponentScan("controller")
//打开AOP注解模式
@EnableAspectJAutoProxy
//打开事务注解模式
@EnableTransactionManagement
public class SpringConfig {

}
