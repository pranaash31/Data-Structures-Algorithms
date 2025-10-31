public class countoccurances {
    public static void main(String[] args) {
        int n = 455599;
        int count = 0;
        while(n>0){
            int rem = n%10;   // here we only getting the number 
            if(rem == 5){
                count++;
            }
            n /= 10;    //removing the number
        }
        System.out.println(count);
    }
    
}