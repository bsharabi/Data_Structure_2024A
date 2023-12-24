package L01;

import java.util.Arrays;

public class RefVar_15 {
    static void ChangeNum(int n1,int n2)
    {
        System.out.println("n1: "+n1+", n2: "+n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("n1: "+n1+", n2: "+n2);

    }


    static void ChangeNumArray(int[] nArr1,int[] nArr2)
    {
        int temp1=nArr1[0];
        int temp2=nArr1[1];

        nArr1[0]=nArr2[0];
        nArr1[1]=nArr2[1];


        nArr2[0]=temp1;
        nArr2[1]=temp2;

    }

    public static void main(String[] args)
    {
        int num1 = 2;
        int num2 = 8;

        System.out.println("BEFORE ------------ num1: "+num1+", num2: "+num2);

        ChangeNum(num1, num2);

        System.out.println("AFTER ------------ num1: "+num1+", num2: "+num2);

        int[] numArr1 ={1,2};
        int[] numArr2 ={3,4};


        System.out.println("BEFORE ------------ numArr1: "+ Arrays.toString(numArr1)+", numArr2: "+Arrays.toString(numArr2));

        ChangeNumArray(numArr1, numArr2);

        System.out.println("AFTER ------------ numArr1: "+ Arrays.toString(numArr1)+", numArr2: "+Arrays.toString(numArr2));


    }
}
