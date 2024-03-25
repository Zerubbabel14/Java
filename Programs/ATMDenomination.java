// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class ATMDenomination {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int amt=scan.nextInt();
        int hun=scan.nextInt();
        int thun=scan.nextInt();
        int fhun=scan.nextInt();
        int thou=scan.nextInt();
        int max=Integer.MIN_VALUE;
        for(int a=0;a<=hun;a++)
        {
            for(int b=0;b<=thun;b++)
            {
                for(int c=0;c<=fhun;c++)
                {
                    for(int d=0;d<=thou;d++)
                    {
                        int total_amt=(a*100)+(b*200)+(c*500)+(d*1000);
                        int total_notes=a+b+c+d;
                        if((total_amt==amt) && (total_notes<=n) && (total_notes>max))
                        {
                            max=total_notes;
                        }
                    }
                }
            }
        }
        System.out.print(max);
    }
}