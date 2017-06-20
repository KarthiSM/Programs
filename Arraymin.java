import java.io.*;
import java.util.*;
public class Arraymin
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int k=in.nextInt();
        int count=0,x,z=a;
        while(z!=0)
        {
            x=z%10;
            z=z/10;
            count++;
        }
        int b[]=new int[count];
        int i=0;
        while(a!=0)
        {
            b[i]=a%10;
            a=a/10;
            i++;
        }
        Arrays.sort(b);
        int len=b.length;
        int m=len-k;
        for(int j=0;j<m;j++)
        {
            System.out.print(b[j]);
        }
        
    }
}
