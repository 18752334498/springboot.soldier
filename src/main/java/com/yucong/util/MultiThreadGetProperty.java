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

    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        List<Callable<List<String>>> tasks = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("ArmyAssignJobVO.java");
        list.add("BodyStateVO.java");
        list.add("DisabledVO.java");
        list.add("EducationVO.java");
        list.add("FamilyVO.java");
        list.add("HonorFamilyVO.java");
        list.add("HonorSoldierVO.java");
        list.add("LifeStateVO.java");
        list.add("RestoreCadreVO.java");
        list.add("RestoreSoldierVO.java");
        list.add("RetireCadreVO.java");
        list.add("RetireSoldierVO.java");
        list.add("RetireWorkerVO.java");
        list.add("SoldierVO.java");
        list.add("ThreeRedVO.java");

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
                new FileReader("D:\\royasoft\\component-solider\\src\\main\\java\\com\\royasoft\\component\\solider\\json\\request\\soldier\\" + className));
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
