package com.prescription.prescriptionmanage.guava;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnel;
import com.google.common.hash.Funnels;

import java.nio.charset.Charset;
import java.util.UUID;

public class BloomFilterDemo {

    private static final int insertions = 10000000;

    public static void main(String[] args) {
        String id = UUID.randomUUID().toString();
        BloomFilter<String> bf = BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_8),insertions);

        for(int i=0;i<insertions;i++){
            String uuid =  UUID.randomUUID().toString();
            String str = String.valueOf(uuid);
            bf.put(str);
        }

        boolean b = bf.mightContain(id);
        System.out.println(b);

    }

}
