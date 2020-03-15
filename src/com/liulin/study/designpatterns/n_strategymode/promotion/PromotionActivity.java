package com.liulin.study.designpatterns.n_strategymode.promotion;

/**
 * Create by DbL on 2020/3/14
 */
public class PromotionActivity {
    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }
    public void execute(){

    }
}
