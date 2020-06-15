package cn.minalz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: minalz
 * @date: 2020-06-14 17:23
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain8083
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderNacosMain8083.class,args);
    }
}
