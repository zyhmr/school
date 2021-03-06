package com.shjd.controller.Recharger;

import com.shjd.service.Recharger.RechargeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * 一卡通支付Controller
 */
@Api(value = "一卡通支付",tags = {"一卡通支付接口"})
@RestController
@RequestMapping("/rechargeController")
@Slf4j
public class RechargeController {

    private RechargeService rechargeService;
    @Autowired
    RechargeController(RechargeService rechargeService){
        this.rechargeService=rechargeService;
    }

    /**
     * 一卡通支付
     *
     * @param cardNo    银行卡号
     * @param money     充值金额
     * @param metroCard 一卡通账号
     * @return
     */
    @ApiOperation(value = "支付",notes = "支付接口")
    @PostMapping("/recharge")
    public String recharge(@ApiParam(name = "cardNo", required = true, value = "银行卡号") @RequestParam(value = "cardNo") String cardNo,
                           @ApiParam(name = "money", required = true, value = "充值金额") @RequestParam(value = "money")BigDecimal money,
                           @ApiParam(name = "metroCard", required = true, value = "一卡通账号") @RequestParam(value = "metroCard")String metroCard) {
        try {
            if (cardNo == null || money == null || metroCard == null) {
                log.error("信息不全");
                return "信息不全，请补充";
            } else {
                return rechargeService.recharge(cardNo, money, metroCard);
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }

}
