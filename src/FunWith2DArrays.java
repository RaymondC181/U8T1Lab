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

}
