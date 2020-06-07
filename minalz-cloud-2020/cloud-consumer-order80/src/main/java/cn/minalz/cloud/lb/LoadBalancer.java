package cn.minalz.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;


/**
 * @description:
 * @author: minalz
 * @date: 2020-06-07 23:56
 **/
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> instances);
}
