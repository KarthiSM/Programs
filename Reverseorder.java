import java.io.*;
import java.util.*;
public class Reverseorder
{
  public static void main (String[] args) {
      Scanner s=new Scanner(System.in);
      String a=s.nextLine();
      String[] a1=a.split(" ");
      int n=a1.length,i;
      for(i=n-1;i>=0;i--)
      {
          System.out.print(a1[i]+" ");
      }
  }  
}
