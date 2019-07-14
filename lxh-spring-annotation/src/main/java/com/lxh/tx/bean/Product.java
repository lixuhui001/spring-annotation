package com.lxh.tx.bean;


import java.io.Serializable;


/**

@author Robot
*/
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
   //
   private String pid;
   //
   private String productName;
   //
   private String dbSource;

   public void setPid(String pid){
         this.pid = pid;
   }
   public String getPid(){
      return this.pid;
   }
   public void setProductName(String productName){
         this.productName = productName;
   }
   public String getProductName(){
      return this.productName;
   }
   public void setDbSource(String dbSource){
         this.dbSource = dbSource;
   }
   public String getDbSource(){
      return this.dbSource;
   }

   @Override
   public String toString() {
      return "Product{" +
              "pid='" + pid + '\'' +
              ", productName='" + productName + '\'' +
              ", dbSource='" + dbSource + '\'' +
              '}';
   }
}