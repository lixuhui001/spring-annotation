
package com.lxh;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 功能描述: 线程池工具类
 *
 * @param:
 * @return:
 * @auther: 李旭辉
 * @date: 2019/3/20/020 13:36
 */
public class ThreadLocalUtil
{

    protected static final ThreadPoolExecutor fixedThreadPool;

    static
    {
//        GooagooLog.info("", "【线程池日志】创建开始...");
        fixedThreadPool = new ThreadPoolExecutor(8, 8, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
//        GooagooLog.info("", "【线程池日志】创建结束..., 创建线程数为： " + InvoiceConstants.CPU_NUMS);

    }

    public static void execute(Runnable command)
    {
        fixedThreadPool.execute(command);
//        GooagooLog.info("", "【线程池日志】当前线程池中线程数目：" + fixedThreadPool.getPoolSize() + "，无界队列中等待执行的任务数目：" + fixedThreadPool.getQueue().size() + "，已执行完的任务数目：" + fixedThreadPool.getCompletedTaskCount());
    }


//    public static void main(String[] args)
//    {
//        for (int i = 0; i < 100; i++)
//        {
//            execute(() ->
//            {
//                try
//                {
//                    Thread.sleep(1000);
//                }
//                catch (InterruptedException e)
//                {
//                    e.printStackTrace();
//                }
//            });
//
//        }
//    }

}
