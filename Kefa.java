import java.util.Scanner;
/**
 * 
 * @author Jack Geissinger github: jackg0
 * Problem URL: http://codeforces.com/problemset/problem/580/A
 * DP solution to Kefa and First Steps
 */
public class Kefa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        
        int max = 1;
        int c = 1;
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] <= arr[i + 1])
            {  
                c++;
            }
            else if(arr[i] > arr[i + 1])
            {
                if(c > max)
                {
                    max = c;
                }
                c = 1;
            }
            if(c > max)
            {
                max = c;
            }
        }
        
        System.out.println(max);
        in.close();
    }

}
