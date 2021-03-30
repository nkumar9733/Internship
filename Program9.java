public class Program9{
    static int totalMarks(int a, int b, int c){
        return a+b+c;
    }

    static float percentage(int a, int b, int c){
        return (totalMarks(a, b, c)/300.0f)*100;
    }
    public static void main(String[] args) {
        System.out.println("Total Marks is : "+Program9.totalMarks(78,45,62));
        System.out.printf("Percentage is : %.2f",Program9.percentage(78,45,62));
    }
}