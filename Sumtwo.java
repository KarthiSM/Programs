import java.io.*;
import java.util.*;
public class Sumtwo
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
        for(i=0;i<n-2;i++)
        {
            for(j=1;j<n-1;j++)
            {
            if(a[i]+a[j]==a[j+1] && i!=j)
            {
                System.out.println(a[i]+" "+a[j]);
            }
        }
    }
}
}
