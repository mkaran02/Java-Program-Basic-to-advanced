import java.util.Scanner;
class max{
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=sc.nextInt();
        System.out.println("Enter Second number:");
        b=sc.nextInt();

        if(a>b)
        {
            System.out.println("max number=" +a);
        }
        else 
        {
            System.out.println("max number=" +b);
        }
    }
}