package com.disizhang;

public class Example4_18 {
        public static void main(String[] args) {
            char[] a={'a','b','c','D','F','E','F'};
            for (int i=0;i<a.length;i++){
                if (Character.isLowerCase(a[i])){
                    a[i]=Character.toUpperCase(a[i]);
                }else if(Character.isUpperCase(a[i])){
                    a[i]=Character.toLowerCase(a[i]);
                }
            }
            for (char i:a){
                System.out.print(i+" ");
            }
    }
}
