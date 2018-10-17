package com.shjd.pojo;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "one_card_info")
@Data
public class OneCardInfo {
    /**
     * 一卡通编号
     */
    @Id
    private Integer id;

    /**
     * 一卡通账号
     */
    @Column(name = "card_no")
    private String cardNo;

    /**
     * 微信openid
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 一卡通密码
     */
    @Column(name = "card_pwd")
    private String cardPwd;

    /**
     * 一卡通余额
     */
    private BigDecimal balance;

    /**
     * 一卡通状态：1 解绑 2 绑定中 3 挂失
     */
    @Column(name = "card_statu")
    private Integer cardStatu;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;
}