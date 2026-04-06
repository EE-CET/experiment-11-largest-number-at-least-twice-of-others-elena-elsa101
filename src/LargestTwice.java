import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                    if (arr[i] > max1) {
                        max2 = max1;
                        max1 = arr[i];
                    } else if (arr[i] > max2) {
                        max2 = arr[i];
                    }
                }
            }
            
            System.out.println(max2);
        }
    }
}

