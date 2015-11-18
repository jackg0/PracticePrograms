import java.util.*;
/**
 * 
 * @author Jack Geissinger github: jackg0
 * Problem URL: http://codeforces.com/problemset/problem/363/B
 * Solution using a Queue (LinkedList)
 */
public class Fence {

    public static void main(String[] args) {
        LinkedList<Integer> paso = new LinkedList<Integer>();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        int sum = 0;
        int minSum = 0;
        int j = 0;
        for(int i = 0; i < k; i++)
        {
            paso.add(in.nextInt());
            sum += paso.get(i);
            j = 1;
        }
        minSum = sum;
        
        for(int i = k; i < n; i++)
        {
            sum -= paso.get(0);
            paso.removeFirst();
            paso.add(in.nextInt());
            sum += paso.get(k - 1);
            
            if(sum < minSum)
            {
                minSum = Math.min(sum, minSum);
                j = i - k + 2;
            }
        }
        
        System.out.println(j);
        in.close();
    }

}
