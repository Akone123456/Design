package com.company.Prototype;

import java.util.HashMap;

/**
 * @author liuxinwei
 * @date 2022/3/1
 */
interface Shape extends Cloneable {
    public Object clone(); // 拷贝

    public void countArea(double r); // 计算面积
}

class Circle implements Shape {

    @Override
    public Object clone() {
        Circle circle = null;
        try {
            circle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝圆失败");
        }
        return circle;
    }

    @Override
    public void countArea(double r) {
        System.out.println("圆的面积:" + 3.1415 * r * r);
    }
}

class Square implements Shape {

    @Override
    public Object clone() {
        Square square = null;
        try {
            square = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝正方形失败");
        }
        return square;
    }

    @Override
    public void countArea(double r) {
        System.out.println("正方形的面积:" + r * r);
    }
}

class ProtoTypeManager {
    private HashMap<String, Shape> ht = new HashMap<>();

    public ProtoTypeManager() {
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }

    public void addshape(String key, Shape obj) {
        ht.put(key, obj);
    }

    public Shape getShape(String key) {
        Shape temp = ht.get(key);
        return (Shape) temp.clone();
    }
}

public class ProtoTypeShap {
    public static void main(String[] args) {
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape obj1 = pm.getShape("Circle");
        obj1.countArea(3);
        Shape obj2 = (Shape) obj1.clone();
        obj2.countArea(3);

        Shape obj3 = pm.getShape("Square");
        obj3.countArea(4);
        Shape obj4 = (Shape) obj3.clone();
        obj4.countArea(4);
    }
}
