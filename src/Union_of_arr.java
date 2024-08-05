// import java.io.*;
// import java.util.*;

// class Union_of_arr {
// public static void main(String args[]) throws IOException {
// BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
// int t = Integer.parseInt(read.readLine().trim());

// while (t-- > 0) {
// // Reading the first array
// String line1 = read.readLine().trim();
// String[] numsStr1 = line1.split(" ");
// int[] a = new int[numsStr1.length];
// for (int i = 0; i < numsStr1.length; i++) {
// a[i] = Integer.parseInt(numsStr1[i]);
// }

// // Reading the second array
// String line2 = read.readLine().trim();
// String[] numsStr2 = line2.split(" ");
// int[] b = new int[numsStr2.length];
// for (int i = 0; i < numsStr2.length; i++) {
// b[i] = Integer.parseInt(numsStr2[i]);
// }

// // Creating an instance of the Solution class
// Solution ob = new Solution();

// // Calling doUnion method and printing the result
// System.out.println(ob.doUnion(a, b));
// }
// }
// }

// class Solution {
// public static int doUnion(int arr1[], int arr2[]) {
// Vector<Integer>a = new Vector<>();
// for(int i = 0;i<arr1.length;i++){
// a.add(arr1[i]);
// }
// for(int i = 0;i<arr2.length;i++){
// a.add(arr2[i]);
// }
// Set<Integer> hash = new HashSet<>(a);
// Vector<Integer> ans = new Vector<>(hash);
// return ans.size();
// }
// }
