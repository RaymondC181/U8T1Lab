import java.lang.reflect.Array;
import java.util.Arrays;

public class Runner2
{
    public static void main(String[] args)
    {
        //2a
        int [][] arr1 = new int[2][3];
        int [][] arr2 = new int[3][2];
        for(int[] arrayList: arr1)
        {
            System.out.println(Arrays.toString(arrayList));
        }
        System.out.println("-----------------------------------");
        for(int[] arrayList: arr2)
        {
            System.out.println(Arrays.toString(arrayList));
        }

        //2b
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        System.out.println("-----------------------------------");
        for(int[] arrayList: arr1)
        {
            System.out.println(Arrays.toString(arrayList));
        }

        //2c
        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;
        System.out.println("-----------------------------------");
        for(int[] arrayList: arr2)
        {
            System.out.println(Arrays.toString(arrayList));
        }
        System.out.println(arr1[0][2] + arr2[2][0]);
    }
}

