import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = (b + c) % 60;
		int e = (b + c) / 60;

		if ((a + e) >= 24) {
			a -= 24;
			System.out.printf("%d %d", (a + e), d);
		} else
			System.out.printf("%d %d", (a + e), d);
    }
}