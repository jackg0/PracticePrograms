import java.util.Scanner;
/**
 * 
 * @author Jack Geissinger github: jackg0
 * Problem URL: http://codeforces.com/problemset/problem/556/A
 * A greedy algorithm solution to Case of the Zeros and Ones
 */
public class greedyZeros {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int z = 0;
        int o = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '0')
            {
                z++;
            }
            else if(s.charAt(i) == '1')
            {
                o++;
            }
        }
        
        System.out.println(s.length() - 2*Math.min(o, z));
        in.close();
    }

}
