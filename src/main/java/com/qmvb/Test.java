package com.qmvb;


import java.io.IOException;

/**
 * Created by Administrator on 2016/12/30.
 */
public class Test {
    public static  void main (String[] args){
       try{
           throw new IOException();
       }catch (IOException io){
            System.out.print("123");
       }
       System.out.print("1234");
    }
}
