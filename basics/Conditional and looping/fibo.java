import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 2;i<=n;i++){
            int temp = b;
            b = b + a;
            a = temp;
            i++;
        }
        System.out.println(b);
        scan.close();
    }
}
