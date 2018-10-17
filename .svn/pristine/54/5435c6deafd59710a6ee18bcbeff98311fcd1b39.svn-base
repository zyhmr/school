package com.shjd.controller.bankcard;

import com.shjd.pojo.CardInfo;
import com.shjd.service.bankcard.BankCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bankCard")
public class BankCardController {

    @Autowired
    private BankCardService bankCardService;

    @RequestMapping("/bundling")
    public String bankCard(@RequestParam("id") Integer id, @RequestParam("name") String name,
                           @RequestParam("idNumber") String idNumber, @RequestParam("bankCardNumber") String bankCardNumber,
                           @RequestParam("tel") String tel){

        CardInfo cardInfo = new CardInfo();
        cardInfo.setCardPhone(tel);
        cardInfo.setStudentId(id);
        cardInfo.setIdCard(idNumber);
        cardInfo.setName(name);
        cardInfo.setCardNo(bankCardNumber);
        cardInfo.setCardLength(String.valueOf(bankCardNumber.length()));
        Integer result = bankCardService.insert(cardInfo);
        if (result == 0){
            return "success";
        }else if (result == 1){
            return "银行卡重复";
        }else {
            return "系统错误";
        }
    }

    @RequestMapping("/unBundling")
    public String bankCard(@RequestParam("id") Integer id){
        Integer result = bankCardService.delete(id);
        if (result == 0){
            return "success";
        }else {
            return "系统错误";
        }
    }
}
