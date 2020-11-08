package Problem1;
/*
    Nam Nguyen
    November 7, 2020
    CSS 143B
    Homework 4
 */
public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target, int lhs, int rhs) {
        //  base case if target is not found
        if(lhs > rhs){
            return -1;
        }
        //  lhs + (rhs - lhs) / 2 to avoid OverFlowException
        int mid = lhs + (rhs - lhs) / 2;

        if(target == data[mid]){
            return mid;
        } else if(target > data[mid]){
            lhs = mid + 1;
        } else if(target < data[mid]){
            rhs = mid - 1;
        }

        return binarySearch(data, target, lhs, rhs);
    }

    public static int binarySearch(int[] data, int target) {
        // homework
        return binarySearch(data, target, 0, data.length - 1);
    }
}
