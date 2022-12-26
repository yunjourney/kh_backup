package 배열의복사2;
// 배열을 깊은 복사 하는 방법 (for, arraycopy, copyOf())
// arraycopy() : 배열을 복사할 때 사용, 주로 배열의 공간이
// 부족한 경우 더 큰 공간을 할당하고자 할 때 사용
// arraycopy(src, src pos, dest, dest pos, length)
// copyOf() : 배열을 원하는 길이 만큼 새로운 배열로 복사

import java.util.Arrays;

public class ArrayCopyMain {
    public static void main(String[] args) {
        // arraycopy
//        int[] arr1 = new int[] {1,2,3,4,5};
//        int[] arr2 = new int[10];
//        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
//        for(int e : arr2) System.out.print(e + " ");

        // for문
//        int[] arr1 = new int[] {1,2,3,4,5};
//        int[] arr2 = new int[10];
//        for(int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }
//        for(int e : arr2) System.out.print(e + " ");

       // copyOf()
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = Arrays.copyOf(arr1, 10);
        for(int e : arr2) System.out.print(e + " ");

    }
}
