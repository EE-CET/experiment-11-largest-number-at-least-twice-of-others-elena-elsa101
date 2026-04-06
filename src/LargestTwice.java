import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        int index = -1;
        
        // Find largest element and its index
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        
        // Check condition
        for (int i = 0; i < n; i++) {
            if (i != index && max < 2 * nums[i]) {
                System.out.println(-1);
                return;
            }
        }
        
        System.out.println(index);
    }
}
