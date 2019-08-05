package com.yucong.util;

public class DropDownTest {


    public static void main(String[] args) {
        String aa =
                "生活类辅助器械、耳背助听器、骨导助听器、功能护理床、防褥疮床垫、防褥疮坐垫";

        String all = aa.replaceAll(" ", "");
        String[] split = all.split("、");

        for (int i = 0; i < split.length; i++) {
            System.out.println((i + 1) + "\t" + split[i].trim());
        }


    }

}
