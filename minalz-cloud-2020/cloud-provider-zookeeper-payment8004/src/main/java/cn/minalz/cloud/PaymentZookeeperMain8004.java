package cn.minalz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: minalz
 * @date: 2020-06-07 17:35
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentZookeeperMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentZookeeperMain8004.class, args);
    }
}
