import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter the operation");
            char op = scan.next().trim().charAt(0);
          
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter the numbers");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                System.out.println();

                if(op == '+'){
                    ans = num1 + num2;
                }

                if(op == '-'){
                    ans = num1 - num2;
                }

                if(op == '*'){
                    ans = num1 * num2;
                }

                if(op == '/'){
                    ans = num1 / num2;
                      
                }

                if(op == '%'){
                    ans = num1 % num2;
                }
            }else if(op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
            break;
        }
    
    }
}
