package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
    }

    public static int int_max(int a, int b){
        if(a > b){
            return  a;
        } else if ((a < b)) {
            return b;
        }
        return a;
    }

    public static int int_min(int a, int b){
        if(a > b){
           return b;
        } else if ((a < b)) {
            return a;
        }
        return a;
    }


}
