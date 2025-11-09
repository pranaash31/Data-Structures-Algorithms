import java.util.Scanner;

public class Gradesystem{
static void printGrade(int marks){
if(marks>100 || marks<0) System.out.println("Invalid marks");
else if(marks>=91) System.out.println("Grade A");
else if(marks>=81) System.out.println("Grade B");
else if(marks>=71) System.out.println("Grade C");
else if(marks>=61) System.out.println("Grade D");
else System.out.println("Fail");
}

public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter marks");
int n = scan.nextInt();
printGrade(n);
}
}

OUTPUT
Enter marks
95
Grade A