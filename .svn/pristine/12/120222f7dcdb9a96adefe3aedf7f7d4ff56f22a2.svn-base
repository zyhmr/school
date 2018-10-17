package com.shjd.controller.bundle;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首次登陆绑定
 *
 * @author YangS
 */
@Controller
@RequestMapping("/bundle")
@Api(value = "回调展示页面")
@Slf4j
public class BundleController {



    BundleController(){

    }

    @GetMapping("/showBundle")
    @ApiOperation(value = "回调至绑定页面", notes = "在微信公众号展示绑定页面")
    public String showBundle(){
        // TODO 跳转至新用户绑定页面，现在页面还没出来没法使用
        return "Hello 徐敏";
    }

    @PostMapping("/saveOneCardAndStudent")
    @ApiOperation(value = "回调至绑定页面", notes = "在微信公众号展示绑定页面")
    public String saveOneCardAndStudent(){
        return "Hello 徐敏";
    }
}
