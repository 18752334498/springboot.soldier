package com.yucong.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadGetProperty {

    /**
     * 字符流的底层是字节流。 两种的用法也不一样，字符流主要是读取文本文件内容的， 可以一个字符一个字符的读取，也可以一行一行的读取文本内容，
     * 大多用于处理字符串。而字节流读取的单位为byte，byte是计算机存储最基本单位， 可以用字节流来读取很多其他的格式文件：比如图片、视频等等
     * 
     * BufferedReader 包装 FileReader, BufferedWrite 包装 FileWriter
     * 
     */

    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        List<Callable<List<String>>> tasks = new ArrayList<>();
        List<String> list = new ArrayList<>();
        // list.add("ArmyServerVO.java");
        // list.add("ArmySettingVO.java");
        // list.add("ArmyTreatVO.java");
        // list.add("ArmyTrainVO.java");
        //
        // list.add("BodyStateVO.java");
        // list.add("EducationVO.java");
        // list.add("FamilyVO.java");
        // list.add("LifeStateVO.java");
        //
        // list.add("DisabledVO.java");
        // list.add("HonorFamilyVO.java");
        // list.add("HonorSoldierVO.java");
        // list.add("RestoreCadreVO.java");
        // list.add("RestoreSoldierVO.java");
        // list.add("RetireCadreVO.java");
        // list.add("RetireSoldierVO.java");
        // list.add("RetireWorkerVO.java");
        // list.add("SoldierVO.java");
        // list.add("ThreeRedVO.java");
        //
        //
        // list.add("child\\Award.java");
        // list.add("child\\ConfigTool.java");
        // list.add("child\\FollowFamily.java");
        // list.add("child\\Honor.java");
        // list.add("child\\House.java");
        // list.add("child\\Publish.java");
        // list.add("child\\Special.java");
        // list.add("child\\Support.java");



        list.add("DepartFwz.java");
        list.add("DepartFwzxdw.java");
        list.add("DepartJgz.java");
        list.add("DepartJnss.java");
        list.add("DepartJxfw.java");
        list.add("DepartLsxj.java");
        list.add("Department.java");
        list.add("DepartPxjg.java");
        list.add("DepartShll.java");
        list.add("DepartXzdw.java");
        list.add("DepartYfsy.java");
        list.add("DepartYfsy.java");
        list.add("DeptAbstract.java");
        for (String string : list) {
            BufferBean bean = new BufferBean(string);
            tasks.add(bean);
        }
        List<Future<List<String>>> all = pool.invokeAll(tasks);

        for (Future<List<String>> future : all) {
            List<String> list2 = future.get();
            for (String s : list2) {
                System.out.println(s);
            }
            System.out.println();
        }

        pool.shutdown();
    }

}


class BufferBean implements Callable<List<String>> {

    private String className;

    public BufferBean(String className) {
        this.className = className;
    }

    @Override
    public List<String> call() throws Exception {
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(
//                new FileReader("D:\\royasoft\\component-solider\\src\\main\\java\\com\\royasoft\\component\\solider\\json\\request\\soldier\\" + className));
        new FileReader("D:\\royasoft\\component-solider\\src\\main\\java\\com\\royasoft\\component\\solider\\entity\\depart\\" + className));
        String str = "";
        String replace = "";
        int count = 0;
        while ((str = br.readLine()) != null) {
            if (str.contains("/** ")) {
                replace = str.replace("/**", "").replace("*/", "").replace(" ", "");
                count = 1;
            }

            if (str.contains("private") && count == 1) {
                count = 2;
                String substring = str.substring(str.indexOf("private") + "private".length() + 1, str.length() - 1);
                String[] split = substring.split(" ");
                String tem = "|" + split[1] + "|否|" + split[0] + "|" + replace + "|";
                list.add(tem);
            }
        }
        br.close();

        // Collections.sort(list);
        return list;
    }

}
