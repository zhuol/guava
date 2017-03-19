package com.google.playground;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by zhuozhuozhuol on 3/19/17.
 */
public class playground {

    public static void main(String[] args){
        List<String> list = Lists.newArrayList("a", "b", "c", "d");
        for(String l:list){
            System.out.println(l);
        }
    }
}
