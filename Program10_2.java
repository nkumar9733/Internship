public class Program10_2 {
    static int a=6;
    static int b=8;
 
    static void swap(int a,int b)
    {
        a=a+b;
        Program10_2.b=a-b;
        Program10_2.a=a-Program10_2.b;
    }
    public static void main(String[] args) {
        System.out.printf("Before swap with %d %d",a,b);
        System.out.println();
        swap(a,b);
        System.out.printf("After swap %d %d",a,b);

    }
}
