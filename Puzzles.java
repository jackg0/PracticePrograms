import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author Jack Geissinger github:jackg0
 * Problem URL: http://codeforces.com/problemset/problem/337/A
 * DP solution to Puzzles.
 */
public class Puzzles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int[] arr = new int[b];
        for(int i = 0; i < b; i++)
        {
            arr[i] = in.nextInt();
        }
        
        Arrays.sort(arr);
        int best = Integer.MAX_VALUE;
        
        for(int k = 0; k < b - a + 1; k++)
        {
            best = Math.min(best, arr[k + a - 1] - arr[k]);
        }
        System.out.println(best);
        
        in.close();

    }

}
