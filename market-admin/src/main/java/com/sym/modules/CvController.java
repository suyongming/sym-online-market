package com.sym.modules;

import com.sym.common.utils.alicv.FaceDetectResult;
import com.sym.common.utils.alicv.FaceRecognConfig;
import com.sym.common.utils.alicv.FaceRecognUtil;
import com.sym.common.utils.alicv.FaceVerifyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suyon
 * @date 2019-11-29 15:39
 */
@RestController
@RequestMapping("cv")
public class CvController {

    @Autowired
    private FaceRecognConfig faceRecognConfig;

    @Autowired
    private FaceRecognUtil faceRecognUtil;

    @GetMapping(value = "/test")
    public String tes(String img,String img1) throws Exception {
        // 人脸检测调用
        FaceDetectResult fDetectResult = faceRecognUtil.faceDetect(img);
        System.out.println(fDetectResult.toString());

        // 人脸对比调用
        FaceVerifyResult fVerifyResult = faceRecognUtil.faceVerify(img,img1);
        System.out.println(fVerifyResult.toString());

        return null;
    }
}
