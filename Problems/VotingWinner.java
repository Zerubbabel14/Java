import java.util.*;
public class VotingWinner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Hashtable<String,Integer> ht=new Hashtable<>();
        String s=scan.nextLine();
        String[] str=s.split(" ");
        int max=Integer.MIN_VALUE;
        Arrays.sort(str);
        for(int i=0;i<str.length;i++)
        {
            if(ht.containsKey(str[i]))
            {
                ht.put(str[i],ht.get(str[i])+1);
                if(ht.get(str[i])>max)
                    max=ht.get(str[i]);
            }
            else
            {
                ht.put(str[i],1);
                if(ht.get(str[i])>max)
                    max=ht.get(str[i]);
            }
        }
        for(int k=0;k<str.length;k++)
        {
            if(ht.get(str[k])==max)
            {
                System.out.print(str[k]+" "+max);
                break;
            }
        }
        scan.close();
    }
}
