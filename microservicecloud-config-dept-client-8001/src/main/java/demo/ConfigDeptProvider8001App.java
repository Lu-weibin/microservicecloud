package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author luwb
 * @date 2019/06/25
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigDeptProvider8001App {
	public static void main(String[] args) {
		SpringApplication.run(ConfigDeptProvider8001App.class,args);
	}
}
