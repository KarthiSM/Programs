import java.io.*;
import java.util.*;
public class Uniquenum
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
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j] && i!=j)
                {
                    a[i]=0;
                    a[j]=0;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
