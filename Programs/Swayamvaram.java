// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Swayamvaram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String s1=scan.next();
        String s2=scan.next();
        char[] bri=s1.toCharArray();
        char[] gro=s2.toCharArray();
        int ans=n;
        char c='*';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(bri[i]==gro[j])
                {
                    bri[i]=c;
                    gro[j]=c;
                    ans--;
                    break;
                }
            }
            if(bri[i]!=c)
                break;
        }
        System.out.print(ans);
    }
}