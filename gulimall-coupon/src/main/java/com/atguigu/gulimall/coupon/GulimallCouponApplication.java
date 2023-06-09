package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 1.如何使用Nacos作为配置中心统一管理配置
 *      1)引入依赖
 *      2)创建一个bootstrap.properties
 *      3)需要给配置中心添加一个叫数据集(Data id)gulimall-couple.properties。默认规则，应用名.properties
 *      4)给应用名.properties 添加任何配置
 *      5)动态获取配置
 *      @RefreshScope: 动态获取并刷新配置
 *      @Value("${配置项的名}"): 获取到配置
 *      如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置。
 *
 *
 * 2.细节
 *      1)命名空间：配置隔离；
 *      默认：public(保留空间)：默认新增的所有配置都在public空间。
 *      1.开发，测试，生产环境有不同的配置
 *
 *      2)配置集：所有配置的集合
 *
 *      3)配置集ID
* */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
