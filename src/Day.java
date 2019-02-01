import java.util.Scanner;

public class Day {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int cases=scan.nextInt();
        while(cases>0){
            String input=scan.next();
            for(int i=0;i<input.length();i=i+2){
                System.out.print(input.charAt(i));
            }
            System.out.print(" ");
            for(int i=1;i<input.length;i=i+2){
                 System.out.print(input.charAt(i));
            }
             System.out.println("");
                cases--;
        }
    }
}
