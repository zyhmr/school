package com.shjd.service.bankcard.imp;

import com.shjd.mapper.CardInfoMapper;
import com.shjd.pojo.CardInfo;
import com.shjd.service.bankcard.BankCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankCardServiceImp implements BankCardService {
    @Autowired
    private CardInfoMapper cardInfoMapper;
    @Override
    public Integer insert(CardInfo cardInfo) {
        try {
            CardInfo card = new CardInfo();
            card.setCardNo(cardInfo.getCardNo());
            if (cardInfoMapper.selectOne(card) != null){
                return 1;
            }
            cardInfoMapper.insertSelective(cardInfo);
            return 0;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 2;
    }

    @Override
    public Integer delete(Integer id) {
        try {
            cardInfoMapper.deleteByPrimaryKey(id);
            return 0;
        }catch (Exception e){
            e.printStackTrace();
        }
       return 1;
    }
}
