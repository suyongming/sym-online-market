/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.sym.modules.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.sym.modules.service.FaceAlibabaCVService;
import org.springframework.stereotype.Component;

@Component
public class FaceAlibabaCVServiceImpl implements FaceAlibabaCVService {

    @Override
    public String distinguish(JSONObject obj) {


        return JSONObject.toJSONString(obj);
    }
}
