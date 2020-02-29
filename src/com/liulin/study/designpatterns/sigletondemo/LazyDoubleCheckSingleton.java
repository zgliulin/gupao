package com.liulin.study.designpatterns.sigletondemo;

/**
 * Create by DbL on 2020/2/26
 */

/**
 *性能提高了，線程安全了，但是代碼更複雜了
 */
public class LazyDoubleCheckSingleton {
    // 指令重排序的問題 加volatile
    private volatile  static LazyDoubleCheckSingleton lazySimpleSingleton;

    private LazyDoubleCheckSingleton(){}

    public  static LazyDoubleCheckSingleton getInstance(){
        // 檢查是否要阻塞
        if(lazySimpleSingleton==null){
            synchronized (LazyDoubleCheckSingleton.class){
                // 檢查是否亞奧創建單例
                if(lazySimpleSingleton==null){
                    lazySimpleSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySimpleSingleton;
    }
}
