package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author luwb
 * @date 2020/12/07
 *
 * EnableEurekaServer: 服务器端启动类,接受其它微服务注册进来
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaServer7001App {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaServer7001App.class, args);
    }

}
