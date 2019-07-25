package com.lxh;

import com.lxh.bean_injection_ioc.bean.Bean01;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: LiXuHui
 * @Date: 2019/7/12/012 14:39
 * @Description:
 */
public class Test
{
    private boolean flag = false;


    public static void main(String[] args) throws InterruptedException
    {

        final FutureSun<Bean01> future = new FutureSun<Bean01>();


        System.out.println("获取" + new Date());

        ThreadLocalUtil.execute(new Runnable()
        {
            @Override
            public void run()
            {

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                future.setT(new Bean01());


            }
        });
        System.out.println("获取等待" + new Date());
        Bean01 bean01 = future.getT();
        //阻塞
        System.out.println("获取结束" + new Date());

        final ReentrantLock reentrantLock = new ReentrantLock();

        for (int i = 0; i < 5; i++)
        {
            ThreadLocalUtil.execute(new Runnable()
            {
                @Override
                public void run()
                {
                    reentrantLock.lock();
                    System.out.println(reentrantLock.getHoldCount());
                    reentrantLock.lock();
                    System.out.println(reentrantLock.getHoldCount());
                    reentrantLock.lock();
                    System.out.println(reentrantLock.getHoldCount());
                    try
                    {
                        System.out.println("锁");
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    reentrantLock.unlock();

                    System.out.println(reentrantLock.getHoldCount());
                    reentrantLock.unlock();
                    System.out.println(reentrantLock.getHoldCount());
                    reentrantLock.unlock();
                    System.out.println(reentrantLock.getHoldCount());
                }
            });
        }

    }

}
