public class Program14 {
    static int greaterNum(int a){
        int mul = 1;
        int sum=0;
        while(a>0){
            int temp = a%10;
            temp=(temp+2)%10;
            sum=temp*mul+sum;
            mul*=10;
            a/=10; 
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(greaterNum(5696));
    }
}
