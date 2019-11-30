package com.sym.common.utils.alicv;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author suyon
 * @date 2019-11-29 15:15
 */


@Data
@Configuration
public class FaceRecognConfig {
    @Value("${ali.ak_id}")
    private String ak_id; //用户ak
    @Value("${ali.ak_secret}")
    private String ak_secret;// 用户ak_secret
    @Value("${ali.verifyUrl}")
    private String verifyUrl;// 人脸对比API接口调用地址
    @Value("${ali.detectUrl}")
    private String detectUrl;// 人脸检测API接口调用地址
}
