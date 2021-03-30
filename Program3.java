public class Program3{
    static int operations(int a){
        a=a+8;
        a=a/3;
        a=a%5;
        a=a*5;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(operations(2345));
    }
}