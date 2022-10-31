package com.driver;

public class Main {
    static class Product{
    public int product(int x , int y){
      return x ;
    }
      public int product(int x , int y , int z){
        return x ;
      }
      public double product(double x , double y){
        return x ;
      }
    }
    public static void main(String[] args){
      Product  p = new Product() ;
      p.product(10,20) ;
      p.product(10,20,40) ;
      p.product(0.2,0.5) ;
    }
  }