import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("dfg");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b= in.nextInt();

        System.out.println(a + " " + b);
        a = swap(a, b=a);
        System.out.println(a + " " + b);
        in.close();
    }

    public static int swap(int a1, int a2){
        return a1;
    }
}