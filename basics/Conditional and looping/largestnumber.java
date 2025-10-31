import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        // int max = a;
        // if(b>max){
        //     max = b;
        // }
        // if(c>max){
        //     max = c;
        // }
        // System.out.println(max);

        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
        scan.close();
    }
}
