package com.zeroten.common.util;

import java.util.Objects;

public class CheckUtils {

    /**
     * String... strings 为可变参数，你可以认为它是String[] strings。如果Strings中有任意一个字符串为空，则返回false 否则返回true.
     * @param strings
     * @return
     */
   public static boolean isAnyEmpty(String... strings){

        boolean flag=true;
        //for循环遍历strings
        for (String str :strings){
              if(" ".equals(str) ){
                  flag=false;
                  break;
              }else {
                  flag=true;
              }
        }

        return flag;
    }


    /**
     * 判断引用类型数组是否为空，为空或null返回true  否则返回false.
     * @param arr
     * @return
     */
    public static boolean isEmpty(Object[] arr) {

        boolean flag=false;
        if(arr ==null || (arr!=null && arr.length==0)){
            flag=true;
        }else {
            flag=false;
        }

        return flag;
    }

    /**
     *  判断str1 str2字符串是否相等，相等则返回true，否则返回false。 当其中一个为null时返回false.
     * @param str1
     * @param str2
     * @return
     */
    public static boolean equals(String str1, String str2){

        if(str1==str2){
            return  true;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        if(ch1!=null && ch2!=null && ch1.length==ch2.length ){
           for (int i=0;i<ch1.length;i++){
                 if(ch1[i]!=ch2[i]){
                     return false;
                 }
              }
           return true;
        }else {
            return false;
        }

    }

    /**
     * 判断n1 n2值是否相等，相等则返回true，否则返回false。 当其中一个为null时返回false.
     * @param n1
     * @param n2
     * @return
     */
    public static boolean equals(Integer n1, Integer n2){

        if(n1>=-128 && n1<=127 && n2>=-128 && n2<=127) {
            if(n1==n2){
                return true;
            }
            return false;
        }else {
           if(n1.equals(n2)){
               return true;
           }
           return false;
        }

    }


}
