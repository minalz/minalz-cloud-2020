package cn.minalz.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: minalz
 * @date: 2020-06-07 23:38
 **/
@Configuration
public class MyRule {

    @Bean
    public IRule getMyRule(){
        return new RandomRule();
    }
}
