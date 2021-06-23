import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[100];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The repeating elements are : ");

        for (int i = 0; i < n; i++)
        {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print(j + " ");
        }
    }
}
