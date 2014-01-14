package com.tanist.time.test;

import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SchedulerMetaData;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RemoteServerExample
{
  public void run()
    throws Exception
  {
    Logger log = LoggerFactory.getLogger(RemoteServerExample.class);

    SchedulerFactory sf = new StdSchedulerFactory();
    Scheduler sched = sf.getScheduler();

    log.info("------- Initialization Complete -----------");

    log.info("------- (Not Scheduling any Jobs - relying on a remote client to schedule jobs --");

    log.info("------- Starting Scheduler ----------------");

    sched.start();

    log.info("------- Started Scheduler -----------------");

    log.info("------- Waiting ten minutes... ------------");
    try
    {
      Thread.sleep(600000L);
    }
    catch (Exception e)
    {
    }

    log.info("------- Shutting Down ---------------------");
    sched.shutdown(true);
    log.info("------- Shutdown Complete -----------------");

    SchedulerMetaData metaData = sched.getMetaData();
    log.info("Executed " + metaData.getNumberOfJobsExecuted() + " jobs.");
  }

  public static void main(String[] args) throws Exception
  {
//    RemoteServerExample example = new RemoteServerExample();
//    example.run();
	  StringBuffer buffer = new StringBuffer();
	  try {
	        String m=new String("÷–Œƒ≤‚ ‘");
	        System.out.println(m);
	        char[] c=m.toCharArray();
	        for(int i=0;i<c.length;i++)
	          buffer.append("\\u"+Integer.toHexString((int)c[i]));
	        
	    } catch (Exception e) {
	        System.out.println(e.toString());

	    }
	    System.out.println(buffer);
	    System.out.println("\u4e2d\u6587\u6d4b\u8bd5");
  }
}


