public class Program15 {
    static int sumOfDigit(int a){
        int sum=0;
        while(a>0){
            int temp = a%10;
            sum=temp+sum;
            a/=10; 
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigit(132));
    }
}
