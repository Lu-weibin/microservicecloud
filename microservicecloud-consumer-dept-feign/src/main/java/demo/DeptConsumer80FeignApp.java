package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author luwb
 * @date 2020/12/07
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"demo"})
public class DeptConsumer80FeignApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80FeignApp.class, args);
    }

}
