package com.yucong.util;

import java.util.Arrays;

public class ss {

    public static void main(String[] args) {
        String aa = "130000  河北省";
        String bb = "130100   石家庄市";
        String cc = "130102     长安区";
        System.out.println(Arrays.toString(aa.split(" ")));
        System.out.println(Arrays.toString(bb.split(" ")));
        System.out.println(Arrays.toString(cc.split(" ")));
    }
}
