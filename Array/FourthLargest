import java.util.Arrays;

public class Foourt {
    public static int findFourthLargest(int[] arr) {
        if (arr.length < 4) {
            throw new IllegalArgumentException("Array must have at least 4 elements");
        }
        
        Arrays.sort(arr);
        return arr[arr.length - 4];
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 5, 25, 15, 30, 8, 20};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Fourth largest number: " + findFourthLargest(arr));
    }
}
