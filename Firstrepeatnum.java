import java.io.*;
import java.util.*;
public class Firstrepeatnum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,i,j;
        n=s.nextInt();
        int[] a=new int[n];
        int[] b=new int[1];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
                {
                b[0]=a[i];    
                }
        }
        System.out.println(b[0]);
    }
}

   
