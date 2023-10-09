package Opgaver;

public class Array_Demo {
    public static void main(String[] args) {
        int[] num=new int [5];
        num[0]=3;
        num[1]=7;
        num[2]=0;
        num[3]=-3;
        num[4]=9;

        System.out.println(num);
        for (int i=0; i<num.length; i++)
        System.out.println(num[i]);

        int s=sum(num);
    }//slut main

    static int sum(int[]arr){
        int result =0;
        for (int i=0; i<arr.length;i++)
            result =result+arr[i];
        return result;

    }//slut class sum int arr
}//slut class Array_Demo