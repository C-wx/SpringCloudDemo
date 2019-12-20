package cbuc.life.springcloud;

import cbuc.life.myrule.CustomerRule;
import cbuc.life.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Explain:
 * @Author: Cbuc
 * @Version: 1.0
 * @Date: 2019/12/3
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration= CustomerRule.class)
public class DeptConsumer800_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer800_App.class,args);
    }
}
