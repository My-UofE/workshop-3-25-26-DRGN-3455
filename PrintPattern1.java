import java.util.Scanner;

public class PrintPattern1 {
    public static void main(String[] var0) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();
        endNum +=1;
        in.nextLine();
        String statement = "";

        for(int i = 1; i < endNum; ++i) {
            statement += (" "+ i);
            System.out.println(statement);
        }
    }
}