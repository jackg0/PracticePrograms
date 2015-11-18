import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author Jack Geissinger github: jackg0
 * Problem URL: http://codeforces.com/problemset/problem/160/A
 * Greedy algorithm solution to Twins.
 */
public class Twins {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        
        int c = 0;
        int sum = 0;
        int minSum = 0;
        Arrays.sort(arr);
        for(int a : arr)
        {
            sum += a;
        }
        for(int i = arr.length - 1; i >= 0; i--)
        {
            minSum += arr[i];
            
            if(minSum > sum - minSum)
            {
                c++;
                break;
            }
            c++;
        }
        System.out.println(c);
        in.close();
    }

}
