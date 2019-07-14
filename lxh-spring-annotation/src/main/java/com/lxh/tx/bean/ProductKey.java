package com.lxh.tx.bean;


import java.io.Serializable;


/**

@author Robot
*/
public class ProductKey implements Serializable {
	private static final long serialVersionUID = 1L;
   private String pid;

   public void setPid(String pid){
         this.pid = pid;
   }
   public String getPid(){
      return this.pid;
   }
}