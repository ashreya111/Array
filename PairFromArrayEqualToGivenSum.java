import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairFromArrayEqualToGivenSum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[100];
        for (int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of sum");
        int sum = sc.nextInt();
        if(arr.length<2)
        {
            System.out.println("Pairs don't exist");
        }
        Set set = new HashSet(arr.length);
        for (int value: arr) {
            int target = sum - value;

            if (!set.contains(target))
            {
                set.add(value);
            }
            else
            {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }
}
