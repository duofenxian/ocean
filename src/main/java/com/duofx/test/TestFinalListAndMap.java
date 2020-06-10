package com.duofx.test;

import org.redisson.misc.Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by duofx on 2020/6/9.
 */
public class TestFinalListAndMap {

    public static void main(String[] args) {
        final List list = new ArrayList();
        list.add("11");

        Map<String, String> map = new HashMap<>();
        map.put("ss", "1");

        try {
            System.out.println("ss");
        }finally {
            System.out.println("aaa");
        }

    }


}
