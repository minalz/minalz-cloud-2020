package cn.minalz.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther minalz
 * @create 2019-12-11 16:57
 */
@Configuration
@MapperScan({"cn.minalz.cloud.alibaba.dao"})
public class MyBatisConfig {
}
