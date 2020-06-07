package cn.minalz.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @description:
 * @author: minalz
 * @date: 2020-06-07 17:36
 **/
@RestController
@Slf4j
public class PaymentZookeeperController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("payment/zk")
    public String paymentzk() {
        return "springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
