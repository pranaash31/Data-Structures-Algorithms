import java.util.Scanner;

public class loop {
    public static void main(String[] args){
    //    for(int num = 0; num<=5; num++){
    //     System.out.println(num); 
    //    } 
        Scanner  scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int num = 1; num<=n; num++){
            System.out.println(num);
        }
        scan.close();
    }
}
