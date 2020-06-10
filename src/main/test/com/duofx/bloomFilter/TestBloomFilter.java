package com.duofx.bloomFilter;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.junit.Test;
import util.BaseJunit4Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duofx on 2020/6/9.
 */
public class TestBloomFilter extends BaseJunit4Test {

    @Test
    public void TestBloomFilter() {
        int total = 1000000; // 总数量
        BloomFilter<CharSequence> bf = BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_8), total);
        // 初始化 1000000 条数据到过滤器中
        for (int i = 0; i < total; i++) {
            bf.put("" + i);
        }
        // 判断值是否存在过滤器中
        int count = 0;
        for (int i = 0; i < total + 10000; i++) {
            if (bf.mightContain("" + i)) {
                count++;
            }
        }
        System.out.println("已匹配数量 " + count);
    }


    @Test
    public void TestFinalList(){
        final List<String> list = new ArrayList<>();
        list.add("ss");
        System.out.println(list);
    }

}
