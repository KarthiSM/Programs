import java.io.*;
import java.util.*;
public class Reversedigit
{
    public static void main (String[] args) {
    Scanner s=new Scanner(System.in);
    int n,a;
    n=s.nextInt();
    while(n>0)
    {
    a=n%10;
    n=n/10;
    System.out.print(a);
    }
    }
}
