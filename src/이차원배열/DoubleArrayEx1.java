package 이차원배열;

import java.util.Arrays;

// 2차원 배열 : 행과 열이 존재
public class DoubleArrayEx1 {
    public static void main(String[] args) {
//        int[][] arr = new int[2][3];
//        int k = 10;
//        for(int i = 0; i < arr.length; i++) { // 행에 대한 길이
//            for (int j = 0; j <arr[i].length; j++) { // 이중 for문 내에 열에 대한 길이
//                arr[i][j] = k;
//                k += 10;
//            }
//        }
//        System.out.println(Arrays.toString(arr[0])); // 2차원 배열은 한번에 안찍히므로 [0]행의 열 값 [1]행의 열 값으로 나눠주는 것
//        System.out.println(Arrays.toString(arr[1]));

        int[][] arr = {
                {100, 200, 300}, // 0행의 0,1,2
                {400, 500, 600} // 1행의 0,1,2
        };

//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//        }
        for (int[] ints : arr) { // ints(배열들)
            for (int e : ints) { // 배열의 형들?
                System.out.print(e + " ");
            }

        }
    }
}
