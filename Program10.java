public class Program10 {
    static int a=6;
    static int b=8;
    static void swap(int a,int b)
    {
        int temp=a;
        Program10.a=b;
        Program10.b=temp;
    }
    public static void main(String[] args) {
        System.out.printf("Before swap with %d %d",a,b);
        System.out.println();
        Program10.swap(a,b);
        System.out.printf("After swap %d %d",a,b);

    }
}
