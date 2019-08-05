package com.yucong.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DogVO {

    private String name;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        int newage = Integer.parseInt(age);
        if (newage > 30) {
            this.age = "不惑之年";
        } else {
            this.age = "年轻人";
        }
    }



}
