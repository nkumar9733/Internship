public class Program1{
    public static int area(int a, int b){
        return a*b;
    }

    public static int perimeter(int a, int b){
        return 2*(a+b);
    }
    public static void main(String[] args){
        System.out.println(Program1.area(5,7));
        System.out.println(Program1.perimeter(5,7));
    }
}