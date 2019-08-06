package com.yucong.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

public class ff {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("D:\\aaa.txt"));

        HashSet<String> set = new HashSet<>();
        String str = "";
        while ((str = br.readLine()) != null) {
            if (str.contains("|")) {
                String[] split = str.split("\\|");
                set.add(split[1]);
            }
        }

        System.out.println(set.size());
        br.close();

    }
}
