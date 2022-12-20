package com.company.Prototype;

/**
 * @author liuxinwei
 * @date 2022/3/1
 */
public class Citation implements Cloneable{
    private String name;
    private String info;
    private String college;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        System.out.println("奖状复制成功");
        return (Citation) super.clone();
    }

    @Override
    public String toString() {
        return "citation{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
