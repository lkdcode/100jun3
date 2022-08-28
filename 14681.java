import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if (a>0 && b>0) System.out.printf("1");
        else if (a<0 && b>0) System.out.printf("2");
        else if (a<0 && b<0) System.out.printf("3");
        else System.out.printf("4");  
    }
}