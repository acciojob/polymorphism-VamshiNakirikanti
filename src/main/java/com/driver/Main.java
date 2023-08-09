package com.driver;

public class Main {
    public class Product{
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
    public void Main(){
        Product p = new Product();
        p.product(1,5);
        p.product(1,2,3);
        p.product(1.0,1.12);
    }
}