//ARMSTRONG NUMBER

public class Armstrongnumber{
static Boolean isArmstrong(int n){
int sum = 0;int temp = n;
while(n>0){
int rem = n%10;
sum += rem*rem*rem;
n = n/10;
}
return sum == temp;
}

public static void main(String[] args){
System.out.println(isArmstrong(153));
}
}