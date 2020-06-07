package cn.minalz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: minalz
 * @date: 2020-06-07 19:24
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain8080 {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain8080.class, args);
    }
}
