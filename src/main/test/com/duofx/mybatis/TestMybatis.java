package com.duofx.mybatis;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.junit.Test;
import util.BaseJunit4Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by duofx on 2020/6/9.
 */

public class TestMybatis extends BaseJunit4Test {

    @Test
//    @Transactional   //标明此方法需使用事务
//    @Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚
    public void TestMybatis() {
        System.out.println("12");
        Map<String, String> map = new HashMap<>();
        map.put("duofx", "1");
        map.put("fenx", "2");
        System.out.println(map);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> m : entries) {
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }


    }


}
