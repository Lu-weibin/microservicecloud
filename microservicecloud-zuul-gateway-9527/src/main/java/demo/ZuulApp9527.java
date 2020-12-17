package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author luwb
 * @date 2020/12/17
 */
@EnableZuulProxy
@SpringBootApplication
public class ZuulApp9527 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApp9527.class, args);
    }

}
