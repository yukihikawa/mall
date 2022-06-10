package com.wrf.mall.service;

import com.wrf.mall.common.api.CommonResult;

/**
 * @program: mall
 * @description: 会员管理service
 * @author: WRF
 * @create: 2022-06-11 00:17
 **/
public interface UmsMemberService {

    /**
     * 生成验证码
     * @param telephone
     * @return
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码与手机号匹配
     * @param telephone
     * @param authCode
     * @return
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
