import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st=in.nextLine();

        System.out.println(isPalindrom(st));
        in.close();
    }
    
    public static boolean isPalindrom(String st){
        StringBuilder builder = new StringBuilder(st);

        String ts=builder.reverse().toString();
        if(st.compareToIgnoreCase(ts) == 0)
            return true;
        return false;
    }
}
