package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author luwb
 * @date 2020/12/17
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApp3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApp3344.class, args);
    }

}
