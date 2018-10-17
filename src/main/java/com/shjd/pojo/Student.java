package com.shjd.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
public class Student {
    /**
     * 学生表编号
     */
    @Id
    private Integer id;

    /**
     * 学校编号
     */
    @Column(name = "school_id")
    private Integer schoolId;

    /**
     * 学号
     */
    @Column(name = "student_no")
    private String studentNo;

    /**
     * 一卡通编号
     */
    @Column(name = "card_id")
    private Integer cardId;

    /**
     * 学生姓名
     */
    @Column(name = "student_name")
    private String studentName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 宿舍编号
     */
    @Column(name = "dorm_id")
    private Integer dormId;
}