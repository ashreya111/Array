import java.util.Scanner;

public class SmallestLargestInArray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[n];
        for (int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Maximum value: " + max);

        int min=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Minimum value: " + min);
    }
}
