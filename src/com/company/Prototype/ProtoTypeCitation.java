package com.company.Prototype;

/**
 * @author liuxinwei
 * @date 2022/3/1
 */
public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation obj1 = new Citation("张三", "同学：被评为三好学生", "清华大学");
        System.out.println(obj1);
        Citation obj2 = (Citation) obj1.clone();
        obj2.setName("李四");
        System.out.println(obj2);
    }
}
