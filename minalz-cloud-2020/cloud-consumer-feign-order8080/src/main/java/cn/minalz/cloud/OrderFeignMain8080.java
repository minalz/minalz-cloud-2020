package cn.minalz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: minalz
 * @date: 2020-06-08 22:19
 **/
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain8080 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain8080.class, args);
    }
}
