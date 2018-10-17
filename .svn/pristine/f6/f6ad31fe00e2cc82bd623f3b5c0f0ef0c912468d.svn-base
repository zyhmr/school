package com.shjd.controller.onecard;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shjd.execption.OneCardInfoController.OnecardBindingException;
import com.shjd.pojo.OneCardInfo;
import com.shjd.service.onecard.OneCardInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/onecard")
@Slf4j
public class OneCardInfoController {
    private OneCardInfoService service;
    @Autowired
    public OneCardInfoController(OneCardInfoService service){
        this.service=service;
    }

    @RequestMapping(value="findAll" ,method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<OneCardInfo> findAll(){
        PageHelper.startPage(1, 10);
        List<OneCardInfo> list = service.findAll();
        return new PageInfo<OneCardInfo>(list);
    }

    @RequestMapping(value="binding" ,method = RequestMethod.GET)
    @ResponseBody
    public Boolean binding(@RequestParam String openId, @RequestParam String cardNo, HttpServletResponse response) throws IOException {
//        Boolean exists=service.exists(openId);
//        if(exists){
            response.sendError(5001,"微信已绑定用户，请解绑后重试");
//        }
//        Boolean binding = service.binding(openId, cardNo);
//        return binding;
        return false;
    }

//    @RequestMapping(value="unbinding" ,method = RequestMethod.POST)
//    @ResponseBody
//    public Boolean unbinding(@RequestParam String openId,@RequestParam String cardNo) throws OnecardBindingException {
//        Boolean exists=service.exists(openId);
//        if(!exists){
//            throw new OnecardBindingException("未绑定用户，无需解绑");
//        }
//        Boolean binding = service.unbinding(openId, cardNo);
//        return binding;
//    }
}
