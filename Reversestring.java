import java.io.*;
import java.util.*;
public class Reversestring
{
    public static void main(String args[])
    {
        String a;
        Scanner s=new Scanner(System.in);
        a=s.nextLine();
        char[] ch=a.toCharArray();
        int n=a.length();
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
    }
}
