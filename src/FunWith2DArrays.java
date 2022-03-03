public class FunWith2DArrays
{
    public static int totalElements(int[][] numArray){
        int numElements = 0;
        for(int[] list: numArray)
        {
            numElements+= list.length;
        }
        return numElements;
    }

    public static void fourCorners(String [][] strArray)
    {
        int numRows = strArray.length;
        int numCol = strArray[0].length;

        System.out.println(strArray[0][0]);
        System.out.println(strArray[0][numCol-1]);
        System.out.println(strArray[numRows-1][0]);
        System.out.println(strArray[numRows-1][numCol-1]);

    }

    public static double average(int[][] numArray)
    {
        double average = 0.0;
        double sum = 0.0;
        for(int[] list: numArray)
        {
            for(int elements : list)
            {
                sum+=elements;
            }
        }
        int totalElements = numArray.length*numArray[0].length;
        average = sum/totalElements;
        return average;
    }

    public static int[] indexFound (String[][] strArray, String str)
    {
        int[] foundIdx = new int[2];
        for(int row = 0; row<strArray.length; row++)
        {
            for(int col = 0; col<strArray[0].length; col++)
            {
               String element = (strArray[row][col]);
               if(element.equals(str))
               {
                   foundIdx[0] = row;
                   foundIdx[1] = col;
                   return foundIdx;
               }
            }
        }
        foundIdx[0] = -1;
        foundIdx[1] = -1;
        return foundIdx;
    }

}