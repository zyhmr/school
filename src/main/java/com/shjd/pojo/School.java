package com.shjd.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
public class School {
    /**
     * 学校编号
     */
    @Id
    private Integer id;

    /**
     * 学校名称
     */
    @Column(name = "school_name")
    private String schoolName;

    /**
     * 学校地址
     */
    @Column(name = "school_address")
    private String schoolAddress;

    /**
     * 一卡通地址
     */
    @Column(name = "one_card_images")
    private String oneCardImages;

}