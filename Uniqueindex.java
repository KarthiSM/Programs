import java.io.*;
import java.util.*;
public class Uniqueindex
{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,j;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            if(a[i]==i)
            {
                System.out.println(a[i]);
            }
        }
    }
}
