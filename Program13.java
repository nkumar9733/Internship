import java.util.ArrayList;

public class Program13 {
    static int sum(int a)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(a>0)
        {
            int temp=a%10;
            arr.add(temp);
            a/=10;
        }
        return arr.get(arr.size()-1)+arr.get(1);
    }
    public static void main(String[] args) {
        System.out.println(Program13.sum(12345));
    }
}
