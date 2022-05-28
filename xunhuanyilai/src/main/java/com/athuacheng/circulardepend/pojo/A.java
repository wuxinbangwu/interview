package com.athuacheng.circulardepend.pojo;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class A {
    public void aa(){
        System.out.println("这是aa方法。。。");
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(11);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("adf","dfads");


    }
}
