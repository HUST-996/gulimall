package com.atguigu.gulimall.thirdparty;


import com.aliyun.oss.OSS;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallThirdPartyApplicationTests {

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
        ossClient.putObject("gulimall-yuming", "wanye2.jpg", inputStream);
        ossClient.shutdown();
        System.out.println("上传完成...");
    }

}
