import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author Jack Geissinger github: jackg0
 * Problem URL: http://codeforces.com/problemset/problem/492/B
 * A DP solution to Vanya and Lanterns.
 */
public class dpVanya {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        
        Arrays.sort(arr);
        double max = 0;
        for(int i = 0; i < n; i++)
        {
            if(i == 0)
            {
                if(arr[i] - 0 > max)
                {
                    max = arr[i] - 0;
                }
            }
            else if(i == n - 1)
            {
                if(l - arr[i] > max)
                {
                    max = l - arr[i];
                }
                else if((double)(arr[i] - arr[i - 1]) / 2.0 > max)
                {
                    max = (double)(arr[i] - arr[i - 1]) / 2.0;
                }
            }            
            else
            {
                if((double)(arr[i] - arr[i - 1]) / 2.0 > max)
                {
                    max = (double)(arr[i] - arr[i - 1]) / 2.0;
                }
            }  
            if(n == 2)
            {
                if((double)(arr[1] - arr[0]) / 2.0 > max)
                {                    
                    max = (double)(arr[1] - arr[0]) / 2.0;
                }
            }
            if(n == 1)
            {
                if(l - arr[i] >= arr[i] - 0)
                {
                    max = l - arr[i];
                }
                else
                {
                    max = arr[i] - 0;
                }
            }
        }
        System.out.format("%.10f%n", max);
        in.close();
    }

}
