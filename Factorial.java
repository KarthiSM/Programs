import java.io.*;
import java.util.*;
public class Factorial
{
    public static void main (String[] args) {
    Scanner s=new Scanner(System.in);
    int n,fact=1;
    n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    System.out.println(fact);
    }
}
