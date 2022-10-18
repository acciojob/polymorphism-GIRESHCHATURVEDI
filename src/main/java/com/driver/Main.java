package com.driver;
class Product{
    public int  product(int x , int y){
        return 0 ;
    }
    public int product(int x,int y,int z){
        return 0 ;
    }
    public double product(double x , double y){
        return 0.0 ;
    }
}
public class Main {
   public static void main(String [] args){
       int x = 0 ;
       int y = 0 ;
       int z = 0 ;
     Product make = new Product() ;
     make.product(x,y) ;
     make.product(x,y,z) ;
       int product = make.product(x, y);
   }
}