import java.lang.reflect.Array;
import java.util.Arrays;

public class FunWith2DArraysRunner {
    public static void main(String[] args) {
//        int[][] testArr1 = {{5, 2}, {1, 3}, {7, 9}};
//        System.out.println(FunWith2DArrays.totalElements(testArr1));

//        // TEST CODE FOR average
//        int[][] testArr1 = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(FunWith2DArrays.average(testArr1));
//        int[][] testArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
//        System.out.println(FunWith2DArrays.average(testArr2));
//        int[][] testArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
//        System.out.println(FunWith2DArrays.average(testArr3));
//        int[][] testArr4 = {{4}, {7}, {8}, {2}};
//        System.out.println(FunWith2DArrays.average(testArr4));
//        int[][] testArr5 = {{4}};
//        System.out.println(FunWith2DArrays.average(testArr5));

        // TEST CODE FOR indexFound
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "stuff")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "good")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "map")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "cat")));
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "time")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "joy")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "bam")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "cat")));




    }
}
