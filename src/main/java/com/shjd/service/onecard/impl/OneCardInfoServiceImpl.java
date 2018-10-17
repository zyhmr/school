package com.shjd.service.onecard.impl;

import com.shjd.mapper.OneCardInfoMapper;
import com.shjd.pojo.OneCardInfo;
import com.shjd.service.onecard.OneCardInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OneCardInfoServiceImpl implements OneCardInfoService {
    private OneCardInfoMapper mapper;
    @Autowired
    public OneCardInfoServiceImpl(OneCardInfoMapper mapper){
        this.mapper =mapper;
    }
    public Boolean binding(String openId, String cardNo){
        return mapper.binding(openId,cardNo);
    }
    public Boolean exists(String openId){
        return  mapper.exists(openId);
    }

    @Override
    public List<OneCardInfo> findAll() {
        return mapper.findAll();
    }
}
