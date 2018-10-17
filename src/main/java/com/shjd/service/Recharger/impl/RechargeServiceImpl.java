package com.shjd.service.Recharger.impl;

import com.shjd.pojo.OneCardInfo;
import com.shjd.pojo.Order;
import com.shjd.service.Recharger.RechargeService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("RechargeService")
public class RechargeServiceImpl implements RechargeService {

    /**
     * 一卡通支付
     *
     * @param cardNo    银行卡号
     * @param money     充值金额
     * @param metroCard 一卡通账号
     * @return
     */
    @Override
    public String recharge(String cardNo, BigDecimal money, String metroCard) {
        try {
            //根据一卡通账号查询一卡通信息
            OneCardInfo oneCardInfo1 = new OneCardInfo();//= oneCardInfoService.findByMetroCard(metroCard);
            if (oneCardInfo1 == null) {
                return "没有一卡通信息";
            }
            // 一卡通金额加上充值金额
            BigDecimal moneys = oneCardInfo1.getBalance().add(money);
            oneCardInfo1.setBalance(moneys);
            //更新一卡通金额
            //oneCardInfoService.updateOneCardInfo(oneCardInfo1);
            //添加订单表信息
            Order order = new Order();
            order.setOneCardId(oneCardInfo1.getId());
            order.setOneCardNo(metroCard);
            order.setCardNo(cardNo);
            order.setMoney(money);
            //orderService.addorder(order);
            return "充值成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
