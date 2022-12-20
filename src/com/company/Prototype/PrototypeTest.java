package com.company.Prototype;

/**
 * @author liuxinwei
 * @date 2022/3/1
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = (Realizetype) obj1.clone();

        System.out.println(obj1 == obj2);
    }
}

class Realizetype implements Cloneable {
    Realizetype() {
        System.out.println("具体原型创建成功");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Realizetype) super.clone();
    }
}
