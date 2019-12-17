package com.zeroten.common.util;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtilsTest {


    @Test
    public void testArray() {

       // Integer[]  arr={1,2,3,4,5};
        int[]  arr={1,2,3,4,5};
        System.out.println("1.for循环使用数组下标");
        for (int index=0;index<arr.length;index++){
            System.out.println(arr[index]);
        }

        System.out.println("2.for each 循环");
        for (int numb:arr){
            System.out.println(numb);
        }

        System.out.println("3.java 8新增的Lambda表达式");
        Arrays.asList(arr).forEach(numb -> System.out.println(numb));

      /*  //1）该方法适用于对象型数据的数组（String、Integer...）
        //
        //（2）该方法不建议使用于基本数据类型的数组（byte,short,int,long,float,double,boolean）
        //
        //（3）该方法将数组与List列表链接起来：当更新其一个时，另一个自动更新
        //
        //（4）不支持add()、remove()、clear()等方法*/


    }

    @Test
    public void testArrayCopy() {

        Integer[] arr1={1,2,3,4,5};
        Integer[] arr2={6,7,8,9,10};

        //拷贝数组arr1 的前3个元素
        Integer[] arr3=Arrays.copyOf(arr1,3);
        System.out.println(Arrays.toString(arr3));

        //拷贝数组arr1的第1位到第3位的元素（不包括第3位）
        Integer[] arr4=Arrays.copyOfRange(arr1,1,3);
        System.out.println(Arrays.toString(arr4));

        //拷贝数组arr2的后3位到arr1的后3位
        System.arraycopy(arr2,2,arr1,2,3);
        System.out.println(Arrays.toString(arr1));
    }

    @Test
    public void testArrayFill() {

        int arr[]=new int[10];
        Arrays.fill(arr,5);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr,arr.length-3,arr.length,3);
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void testArraySort() {

        int arr[] = new int[100];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = new Random().nextInt(100);
        }
        System.out.println("排序前："+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));


        String[][] users=new String[3][];
        users[0]=new String[4];
        users[0][0]="001";
        users[0][1]="张三";
        users[0][2]="女";
        users[0][3]="25";

        users[1]=new String[4];
        users[1][0]="002";
        users[1][1]="李四";
        users[1][2]="男";
        users[1][3]="30";


        System.out.println(Arrays.toString(users));
        for (String[] user:users){
           System.out.println(Arrays.toString(user));
        }


    }

    @Test
    public void testArrayTarget() {

        int[] nums=new int[]{2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));


    }
    public int[] twoSum(int[] nums,int target){
        for (int start=0;start<nums.length-1;start++){
            for (int secondNumStart=start+1;secondNumStart<nums.length;secondNumStart++){
                if(nums[start]+nums[secondNumStart]==target){
                   return new int[]{start,secondNumStart};
                }
            }
        }
        return null;
    }


    @Test
    public void testName() {

        int[] arr=new int[]{2,6,9,1,4,3,6,2,0,10,33,23,11,9,8,7,4,15};
        System.out.println(Arrays.toString(ArrayUtils.sort(arr)));
    }
}
