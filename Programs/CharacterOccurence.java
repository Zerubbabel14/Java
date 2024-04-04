import java.util.*;
public class CharacterOccurence {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        char c=scan.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                count++;
            }
        }
        System.out.print(count);
        scan.close();
    }
}
