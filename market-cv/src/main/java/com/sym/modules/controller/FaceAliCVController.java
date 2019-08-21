/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.sym.modules.controller;

import com.alibaba.fastjson.JSONObject;
import com.sym.modules.service.FaceAlibabaCVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 人脸识别
 * @author suyongming
 */
@EnableEurekaClient
@RestController
@RequestMapping("cv")
public class FaceAliCVController {
	@Autowired
	private FaceAlibabaCVService faceAlibabaCVService;

	/**
	 * 人脸认证
	 */
	@PostMapping("/person/face/distinguish")
	public String personAuth(@RequestBody JSONObject obj)throws IOException {
		return faceAlibabaCVService.distinguish(obj);

	}


	
}
