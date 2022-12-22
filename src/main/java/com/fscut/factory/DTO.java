package com.fscut.factory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author liuxinwei
 * @date 2022/12/20 19:03
 */
@XmlRootElement(name = "object")
@XmlAccessorType(XmlAccessType.FIELD)
public class DTO {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
