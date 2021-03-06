import java.util.Scanner;
/**
 * 
 * @author Jack Geissinger github: jackg0
 * @version 1.0
 * Problem URL: http://codeforces.com/problemset/problem/550/A
 * Two Substrings using DP.
 */
public class TwoSubdp {

    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        String ans = "";
        String word = in.nextLine();
        int f = word.indexOf("AB");
        int g = word.indexOf("BA");
        int sep = Math.abs(f - g);
        if(f != -1 && g != -1)
        {
            int f2 = f;
            int g2 = g;
            loop:
            while(sep == 1 && f2 != -1 && g2 != -1)
            {
                
                for(int i = 0; i < 5; i++)
                {            
                    f2 = word.indexOf("AB", f2 + 1);
                    if(f2 != -1)
                    {
                        sep = Math.abs(f2 - g);
                        if(sep != 1)
                        {
                            break loop;
                        }  
                    }
                }
                for(int i = 0; i < 5; i++)
                {
                    g2 = word.indexOf("BA", g2 + 1);
                    if(g2 != -1)
                    {
                        sep = Math.abs(f - g2);
                        if(sep != 1)
                        {
                            break loop;
                        }
                    }
                }
            }

            if(sep != 1)
            {
                ans = "YES";
            }
            else
            {
                ans = "NO";
            }
        }
        else
        { 
            ans = "NO";
        }

        System.out.println(ans);
        in.close();
    }

}
