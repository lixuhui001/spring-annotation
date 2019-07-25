package com.lxh;

/**
 * @Auther: LiXuHui
 * @Date: 2019/7/12/012 14:40
 * @Description:
 */
public class Future<T>
{
    private T t;
    volatile boolean syFlag = true;


    public synchronized T getT() throws InterruptedException
    {
        System.out.println("等待");
        System.out.println(syFlag);
        if (syFlag)
        {
            this.wait();
        }
        System.out.println("等待结束");

        return t;
    }

    public synchronized void setT(T t)
    {
        this.notify();
        syFlag = false;
        this.t = t;
    }


}
