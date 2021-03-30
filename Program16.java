public class Program16 {
    static int reverseNum(int a){
        int sum=0;
        while(a>0){
            int temp = a%10;
            sum=sum*10+temp;
            a/=10; 
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(reverseNum(132));
    }
}
