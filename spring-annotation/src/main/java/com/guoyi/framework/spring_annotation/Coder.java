package com.guoyi.framework.spring_annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 码农
 * @author WTJ
 * bean 定義Component Controller Service Repository 
 * 依賴注入 @Autowired @Resource(name="sb")
 */
@Component 
public class Coder {
    private String name;
    private int age;
    
    //默認基於類型注入
    @Resource
    private Hand hand;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Hand getHand() {
        return hand;
    }
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    @Override
    public String toString() {
        return "Coder [name=" + name + ", age=" + age + ", hand=" + hand + "]";
    }
    
    
}
