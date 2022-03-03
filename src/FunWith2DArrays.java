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


}
