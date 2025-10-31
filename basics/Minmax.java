class Minmax{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int min = arr[0], max = arr[0];
        for(int n : arr){
            if(n < min) min = n;
            if(n > max) max = n;
        }
        System.out.println("Min: "+ min + "Max: "+ max);
    }
}