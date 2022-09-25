import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String studentCount=sc.nextLine();
        StringTokenizer tk=new StringTokenizer(studentCount," ");
        int sum = 0, count = 0;
        while (tk.hasMoreElements()){
            sum += Integer.parseInt(tk.nextToken());
            count++;
        }
        System.out.println((sum /= count));
    }
}
