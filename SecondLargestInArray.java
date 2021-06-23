import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[100];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        n=arr.length;
        Arrays.sort(arr);
        System.out.println("Second largest element is: " + arr[n-2]);
    }
}
