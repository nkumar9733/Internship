public class Program4{
    static int operations(int a){
        a+=8;
        a/=3;
        a%=5;
        a*=5;
        return a;
    }


    public static void main(String[] args) {
        System.out.println(operations(2345));
    }
}