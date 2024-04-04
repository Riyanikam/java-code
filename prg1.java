Q1: Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        // Move all non-zero elements of X to front
        int k = 0;
        for (int i = 0; i < m; i++) {
            if (X[i] != 0) {
                X[k++] = X[i];
            }
        }
        
        // Merge Y[] into X[]
        int i = k; // Start index of X[]
        int j = 0; // Start index of Y[]
        int l = 0; // Start index of merged array
        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[l++] = X[i++];
            } else {
                X[l++] = Y[j++];
            }
        }
        
        // Copy remaining elements of Y[] if any
        while (j < n) {
            X[l++] = Y[j++];
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        mergeArrays(X, Y);

        // Print the merged array
        for (int num : X) {
            System.out.print(num + " ");
        }
    }
}
