import java.util.HashSet;
import java.util.Scanner;

public class DuplicateInArray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements: ");
        int n= sc.nextInt();
        int[] array = new int[100];
        System.out.println("Enter the array elements:");
        for(int i=0; i<n ;i++)
        {
            array[i] = sc.nextInt();
        }
        HashSet<Integer> s = new HashSet<Integer>();
        int flag = 0;
        for(int i=0;i<n;i++)
        {
            if(s.contains(array[i]))
            {
                System.out.println("Repeating number is " + array[i]);
                flag = 1;
            }
            s.add(array[i]);
        }
        if(flag==0)
        {
            System.out.println("There are no repeating elements in the array");
        }

    }
}
