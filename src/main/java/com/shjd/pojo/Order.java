package com.shjd.pojo;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
public class Order {
    /**
     * 订单编号
     */
    @Id
    private Integer id;

    /**
     * 一卡通编号
     */
    @Column(name = "one_card_id")
    private Integer oneCardId;

    /**
     * 一卡通账号
     */
    @Column(name = "one_card_no")
    private String oneCardNo;

    /**
     * 银行卡卡号
     */
    @Column(name = "card_no")
    private String cardNo;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 充值方式 1 支付宝 2 微信 3 银联
     */
    @Column(name = "pay_way")
    private Integer payWay;

    /**
     * 消费类型 1 充值 2 消费
     */
    @Column(name = "consume_type")
    private Integer consumeType;

}