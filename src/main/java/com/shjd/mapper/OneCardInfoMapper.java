package com.shjd.mapper;


import com.shjd.pojo.OneCardInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OneCardInfoMapper  {
    Boolean binding(@Param("openId") String openId, @Param("cardNo") String cardNo);
    Boolean exists(@Param("openId")String openId);
    List<OneCardInfo> findAll();
}