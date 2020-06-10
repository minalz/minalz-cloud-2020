package cn.minalz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @description:
 * @author: minalz
 * @date: 2020-06-10 07:59
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class OrderHystrixMain8080 {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain8080.class, args);
    }
}
