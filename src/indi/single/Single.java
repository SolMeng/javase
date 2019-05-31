package indi.single;

/**
 * @program: javase
 * @description: 单例设计模式
 * @author: Sol Meng
 * @create: 2019-05-31
 *
 * 解决的问题：保持一个类在内存中的对象唯一性
 * ex.比如：多程序读取一个配置文件时，建议配置文件封装成对象。会方便操作其中数据，
 *         又要保证多个程序读到的是同一个配置文件对象，就需要该配置文件对象在内存中是唯一的。
 * 如何保证对象唯一性？
 * 1.不让其它类创建该对象(构造函数私有化)
 * 2.在本类中创建一个本类对象(创建私有并静态的本类对象，随类加载而加载)
 * 3.定义一个方法,返回该对象，其它程序可以通过该方法得到本类对象。(公有静态方法,返回对象)
 **/


/**
 * 1.饿汉式(直接加载)
 */
public class Single {

    private static Single single = new Single();
    private Single(){};
    public  static Single getSingle(){
        return single;
    }
}

/**
 * 2.懒汉式(延迟加载)
 */
class Single2{
    private Single2(){};
    private static Single2 single = null;
    public static Single2 getSingle(){
        if(single == null){
           single = new Single2();
        }
        return single;
    }

}