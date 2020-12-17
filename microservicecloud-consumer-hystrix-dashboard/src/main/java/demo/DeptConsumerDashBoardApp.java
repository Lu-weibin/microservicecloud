package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author luwb
 * @date 2020/12/17
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashBoardApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashBoardApp.class, args);
    }

}
