package com.shjd.pojo;

import lombok.Data;

import javax.persistence.*;

@Table(name = "card_info")
@Data
public class CardInfo {
    /**
     * 银行卡编号
     */
    @Id
    private Integer id;

    /**
     * 学生编号
     */
    @Column(name = "student_id")
    private Integer studentId;

    /**
     * 手机号
     */
    @Column(name = "card_phone")
    private String cardPhone;

    /**
     * 身份证编号
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 银行卡号
     */
    @Column(name = "card_no")
    private String cardNo;

    /**
     * 银行名称(英文)
     */
    @Column(name = "enbank_name")
    private String enbankName;

    /**
     * 银行名称(中文)
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * 银行简称
     */
    private String abbreviation;

    /**
     * 银行卡bin
     */
    @Column(name = "cardprefix_num")
    private String cardprefixNum;

    /**
     * 银行卡bin长度
     */
    @Column(name = "cardprefix_length")
    private String cardprefixLength;

    /**
     * 银行卡类型
     */
    @Column(name = "card_type")
    private String cardType;

    /**
     * 银行卡名称
     */
    @Column(name = "card_name")
    private String cardName;

    /**
     * 银行卡长度
     */
    @Column(name = "card_length")
    private String cardLength;

    /**
     * 	银行网址
     */
    @Column(name = "bank_url")
    private String bankUrl;

    /**
     * 银行LOGO
     */
    @Column(name = "bank_image")
    private String bankImage;

    /**
     * 银行电话
     */
    @Column(name = "service_phone")
    private String servicePhone;

    /**
     * 是否信用卡：1 借记卡 2 信用卡
     */
    @Column(name = "is_credit_card")
    private Integer isCreditCard;

    /**
     * 持卡人姓名
     */
    private String name;
}