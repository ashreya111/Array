import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements in the array you want to enter: ");
        int n = sc.nextInt();
        int[] a = new int [100];
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        n++;
        int sum = n*(n+1)/2;
        int s = 0;
        for(int i=0; i<n-1; i++)
        {
            s+=a[i];
        }
        int m = sum-s;
        System.out.println("Missing number is " + m);
    }
}
