package com.atguigu.gulimall.product;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    OSS ossClient;
    @Test
    public void contextLoads() throws FileNotFoundException {

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("");
//        brandEntity.setName("华为");
//        System.out.println(brandService);
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
//        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 9L));
//        brand_id.forEach(System.out::println);
        InputStream inputStream = new FileInputStream("D:\\backgroundImage\\wanye.jpg");
        ossClient.putObject("gulimall-yuming", "wanye.jpg", inputStream);
        ossClient.shutdown();
        System.out.println("上传完成...");
    }

}
