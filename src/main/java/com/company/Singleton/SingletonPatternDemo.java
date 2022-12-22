package com.company.Singleton;

/**
 * @author liuxinwei
 * @date 2022/3/1
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}

class Sinleton {
    private static  class SingleonHolder{
    private  static  final  Sinleton INSTANCE = new Sinleton();
    }
    private Sinleton() {
    }

    public static Sinleton getInstance() {
       return SingleonHolder.INSTANCE;
    }
}

