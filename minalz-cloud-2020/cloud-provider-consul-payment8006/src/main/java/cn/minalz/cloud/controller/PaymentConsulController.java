package cn.minalz.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @description:
 * @author: minalz
 * @date: 2020-06-07 19:31
 **/
@RestController
@Slf4j
public class PaymentConsulController {

    @Value("{server.port}")
    private String serverPort;

    @GetMapping("/payment/consul")
    public String paymentConsul() {
        return "springcloud with consul: " + serverPort + "\t   " + UUID.randomUUID().toString();

    }
}
