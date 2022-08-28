import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a;
        a=scan.nextInt();
        
        if(a>=90){
            System.out.printf("A");
        }else if(a>=80){
            System.out.printf("B");
        }else if(a>=70){
            System.out.printf("C");
        }else if(a>=60){
            System.out.printf("D");
        }else{
            System.out.printf("F");
        }
    }
}