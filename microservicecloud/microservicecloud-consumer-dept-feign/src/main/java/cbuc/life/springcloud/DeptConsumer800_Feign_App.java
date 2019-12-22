package cbuc.life.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Explain:
 * @Author: Cbuc
 * @Version: 1.0
 * @Date: 2019/12/20
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"cbuc.life.springcloud"})
@ComponentScan("cbuc.life.springcloud")
public class DeptConsumer800_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer800_Feign_App.class,args);
    }
}
