package com.athuacheng.interview.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1、CAS是什么？
 * 比较并交换
 */
public class CASDemo {
    public static void main(String[] args) {
        System.out.println("进入主方法");
        System.out.println("hot-fix test");
        System.out.println("fweb commit");
        AtomicInteger atomicInteger = new AtomicInteger(5);
        System.out.println(atomicInteger.compareAndSet(5, 23) + ":" + atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(5, 88) + ":" + atomicInteger.get());


        Long gaobao = 0l;
        for (int i = 0; i < 100; i++) {
            //
            if(i<43){
                gaobao += 17000;
                gaobao+= 9700;
            }else{
                gaobao += 8457;
                gaobao += 4822;
            }
        }
        System.out.println(gaobao);
        //




        long feibao = 0l;
        for (int i = 0; i < 100; i++) {
            //
            if(i<12){
                feibao+= 12000;
                feibao += 21577;
            }else{
                feibao+= 4650;
                feibao += 8154;
            }
        }
        System.out.println(feibao);
        /*Long gongji1;//获取攻击力
        Long baoji1;//获取暴击
        Long baoshang1;//获取爆伤
        Long yuansu1;//获取元素伤害
        Long wushang1;//获取元素伤害
        Long wulibili;//获取物理权重
        Long yuansubili;//获取元素权重*/
        //long res=
        /**
         *  (
         *  change(gongji1.value) *
         *  (change(baoji1.value) * 0.01
         *  ) *
         *  (1 + change(baoshang1.value) * 0.01) *
         *  (1 + change(wushang1.value) * 0.01) +
         *  change(gongji1.value) *
         *  (1 - change(baoji1.value) * 0.01) *
         *  (1 + change(wushang1.value) * 0.01)
         *  ) * (change(wulibili.value) * 0.01) +
         *  (change(gongji1.value) * (change(baoji1.value) * 0.01) * (1 + change(baoshang1.value) * 0.01) * (1 + change(yuansu1.value) * 0.01) + change(gongji1.value) * (1 - change(baoji1.value) * 0.01) * (1 + change(yuansu1.value) * 0.01)) * (change(yuansubili.value) * 0.01
         *  );
         */

    }
}
