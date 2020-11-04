package cn.jeasky.sort;

import org.junit.Test;

/**
 * @program: LeetcodeProject
 * @description: 各种排序
 * @author: Jeasky
 * @create: 2020-11-04 14:23
 **/
public class sorts {

    private final static int[] a={3,9,1,0,2,6,8,5,4,7};
    /**
     * @Description: 冒泡排序,复杂度nlg(n)
     * @Param: 乱序数组
     * @return: 排序后的数组
     * @Date: 2020/11/4
     */
    @Test
    public void BubbleSort(){
        int size = a.length;
        int[] b = a;
        System.out.print("排序之前：");
        for(int l:a)
            System.out.print(l+" ");
        System.out.println();
        for(int i=0; i< size; i++){
            System.out.println("第"+(i+1)+"次冒泡排序：");
            for(int j=0; j< size-i-1; j++){
                if(b[j] > b[j+1]){
                    int temp= b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
                for(int k : b)
                    System.out.print(k+" ");
                System.out.println();
            }
        }
    }

    /**
    * @Description: 插入排序
    * @Param: 入参为乱序数组
    * @return: void
    * @Date: 2020/11/4
    */
    public void insertSort(){
        int[] b = a;
        int size = a.length;
        System.out.println("排序前的数组：");
        for(int l: a)
            System.out.print(l+" ");
        System.out.println();
        for(int i =0; i<size; i++){
            System.out.println("第"+i+"次排序：");
            //TODO 待完善插入排序
            while(b[i] < b[i+1])
                System.out.println();
        }
    }

    //TODO 待补充快速排序
}
