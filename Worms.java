import java.util.Scanner;
/**
 * 
 * @author Jack Geissinger github: jackg0
 * Problem URL: http://codeforces.com/problemset/problem/474/B
 * Solution using binary search.
 */
public class Worms {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] bounds = new int[n + 1];
        bounds[0] = 0;
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            int pile = in.nextInt();
            bounds[i] = sum + pile;
            sum += pile;
        }
        int m = in.nextInt();
        for(int i = 0; i < m; i++)
        {
            int r = in.nextInt();
            System.out.println(binarySearch(bounds, r));
        }
        in.close();

    }
    
    public static int binarySearch(int[] bounds, int r)
    {
        int lo = 1;
        int hi = bounds.length;
        while (lo <= hi)
        {
            int mid = lo + (hi - lo)/2;
            if(mid == 0)
            {
                break;
            }
            if(r <= bounds[mid] && r > bounds[mid - 1])
            {
                return mid;
            }
            else if(r > bounds[mid])
            {
                lo = mid + 1;
            }
            else
            {
                hi = mid - 1;
            }
        }
        return 0;
    }

}
