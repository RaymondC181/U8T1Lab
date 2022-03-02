import java.lang.reflect.Array;
import java.util.Arrays;

public class Runner
{
    //1a
    public static void main(String[] args) {
        String[][] seatChart = {
            {"Abby","Don", "George", "Kim"},
            {"Brian","Elenor", "Harry", "Lenny"},
            {"Cathy","Fred", "Jill", "Matt"}};

        for(String[] list: seatChart)
        {
            System.out.println(Arrays.toString(list));
        }

        //1b
        System.out.println("-------------------------------------");
        seatChart[1][2] = "paul";
        for(String[] list: seatChart)
        {
            System.out.println(Arrays.toString(list));
        }

        //1c
        System.out.println("-------------------------------------");
        String temp = seatChart[0][0];
        seatChart[0][0] = seatChart[2][3];
        seatChart[2][3] = temp;
        for(String[] list: seatChart)
        {
            System.out.println(Arrays.toString(list));
        }

        //1d
        System.out.println("-------------------------------------");
        String[] temp2 = seatChart[0];
        seatChart[0] = seatChart[1];
        seatChart[1] = temp2;
        for(String[] list: seatChart)
        {
            System.out.println(Arrays.toString(list));
        }

        System.out.println(seatChart[0][2] + seatChart[2][0]);

    }
}

