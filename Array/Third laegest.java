import java.util.Arrays;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1, 5, 3, 45, 23};
        System.out.println("Third Largest: " + findThirdLargest(arr));
    }
    
    public static int findThirdLargest(int[] arr) {
        if (arr.length < 3) {
            return -1;
        }
        
        Arrays.sort(arr);
        return arr[arr.length - 3];
    }
}
