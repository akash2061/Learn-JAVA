import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int d = 2;
        Solution.rotateArr(arr, d, n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

class Solution {
    static void rotateArr(int arr[], int d, int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = arr[(i + d) % n];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }
    }
}