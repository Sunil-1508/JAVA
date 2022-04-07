import java.util.Scanner;
class swap
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        a^=b;
        b^=a;
        a^=b;
        System.out.println("a="+a+"\n"+"b="+b);
        
    }
}