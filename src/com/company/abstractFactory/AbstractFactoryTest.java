package com.company.abstractFactory;

/**
 * @author liuxinwei
 * @date 2022/2/28
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        ComputerFactory lenovoFactory = new LenovoFactory();
        lenovoFactory.createDesktopComputer().start();
        lenovoFactory.createNotebookComputer().start();
        ComputerFactory hpFactory = new HpFactory();
        hpFactory.createDesktopComputer().start();
        hpFactory.createNotebookComputer().start();

    }
}

/*
定义抽象产品类
 */
abstract class DesktopComputer {
    public abstract void start();
}

abstract class NotebookComputer {
    public abstract void start();
}

class LenovoDesktopComputer extends DesktopComputer {

    @Override
    public void start() {
        System.out.println("联想台式机启动");
    }
}

class HpDesktopComputer extends DesktopComputer {

    @Override
    public void start() {
        System.out.println("惠普台式机启动");
    }
}

class LenovoNotebookComputer extends NotebookComputer {

    @Override
    public void start() {
        System.out.println("联想笔记本电脑启动");
    }

}

class HpNotebookComputer extends NotebookComputer {

    @Override
    public void start() {
        System.out.println("惠普笔记本电脑启动");
    }
}

/*
抽象工厂
 */
abstract class ComputerFactory {
    public abstract DesktopComputer createDesktopComputer();

    public abstract NotebookComputer createNotebookComputer();
}

/*
具体工厂
 */

class LenovoFactory extends ComputerFactory {

    @Override
    public DesktopComputer createDesktopComputer() {
        return new LenovoDesktopComputer();
    }

    @Override
    public NotebookComputer createNotebookComputer() {
        return new LenovoNotebookComputer();
    }
}

class HpFactory extends ComputerFactory {

    @Override
    public DesktopComputer createDesktopComputer() {
        return new HpDesktopComputer();
    }

    @Override
    public NotebookComputer createNotebookComputer() {
        return new HpNotebookComputer();
    }
}
