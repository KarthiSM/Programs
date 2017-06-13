
public class Number
{
    public static void main (String[] args) {
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    if(n>0)
    {
        System.out.println("Positive number");
    }
    else if(n<0)
    {
        System.out.println("negative number");
    }
    else
    {
        System.out.println("Zero");
    }
    }
}
