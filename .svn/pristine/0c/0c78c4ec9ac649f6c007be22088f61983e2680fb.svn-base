package com.shjd.controller.callback;

import com.shjd.config.ProjectUrlConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 微信公众号回调配置页面
 *
 * @author YangS
 */
@Controller
@RequestMapping("/wechat")
@Api(value = "微信回调页面")
@Slf4j
public class WeChatController {


    private WxMpService wxMpService;

    private ProjectUrlConfig projectUrlConfig;

    @Autowired
    WeChatController(WxMpService wxMpService, ProjectUrlConfig projectUrlConfig) {
        this.wxMpService = wxMpService;
        this.projectUrlConfig = projectUrlConfig;
    }

    @GetMapping("auth")
    @ApiOperation(value = "微信授权请求页面", notes = "请求获取微信授权信息，并设置回调地址")
    public String auth(@RequestParam("returnUrl") String returnUrl) {

        // 该地址需要修改为 natapp 穿透映射的地址
        // 以及 application.yml中的mpAppId，mpAppSecret需要换成微信测试账号的地址
        String url = projectUrlConfig.getDoMain() + "/wechat/userInfo";
        String redirectUrl = null;
        try {
            redirectUrl = wxMpService.oauth2buildAuthorizationUrl(url, WxConsts.OAUTH2_SCOPE_BASE, URLEncoder.encode(returnUrl, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            log.error("回调地址转义出错");
            e.printStackTrace();
        }
        log.info("微信网页授权获取code,result={}", redirectUrl);
        return "redirect:" + redirectUrl;
    }

    @GetMapping("/userInfo")
    @ApiOperation(value = "授权码解析", notes = "解析授权码获得微信用户唯一ID（openid），判定是否新用户")
    public String userInfo(@RequestParam("code") String code,
                           @RequestParam("state") String returnUrl) {
        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = new WxMpOAuth2AccessToken();
        try {
            wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);
        } catch (WxErrorException e) {
            log.error("【微信网页授权】{}", e);
        }

        String openId = wxMpOAuth2AccessToken.getOpenId();
        // TODO 至此openId 已经解析到了，需要查询数据库该openId是否注册了个人信息
        // TODO 如果有个人信息则跳转到首页，反之绑定
        if (openId != null) {
            returnUrl = projectUrlConfig.getDoMain() + "/bundle/text";
        }
        return "redirect:" + returnUrl + "?openid=" + openId;
    }
}
