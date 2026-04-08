class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        // 1. Найдём подходящую строку
        int top = 0;
        int bottom = m - 1;

        while (top <= bottom) {
            int midRow = top + (bottom - top) / 2;

            if (matrix[midRow][0] <= target && target <= matrix[midRow][n - 1]) {
                // target может быть в этой строке
                return binarySearch(matrix[midRow], target) != -1;
            } else if (matrix[midRow][0] > target) {
                bottom = midRow - 1;
            } else {
                top = midRow + 1;
            }
        }

        return false;
    }
    }


public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1; // не найдено
}
