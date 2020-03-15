package com.liulin.study.designpatterns.n_strategymode.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by DbL on 2020/3/14
 */
public class PromotionStrategyFactory {
    private static Map<String,IPromotionStrategy> PROMOTIONS = new HashMap<String,IPromotionStrategy>();
    static{
        PROMOTIONS.put(PromotionKey.CASH,new CashbackStrategy());
        PROMOTIONS.put(PromotionKey.COUPON,new CouponStrategy());
    }
    private void PromotionActivity(){}

    public static IPromotionStrategy getPromotionStrategy(String promotionKey){
        IPromotionStrategy strategy = PROMOTIONS.get(promotionKey);
        if(strategy!=null){
            return strategy;
        }
        return null;
    }
    private interface PromotionKey{
        String COUPON="COUPON";
        String CASH="CASH";
    }
}
