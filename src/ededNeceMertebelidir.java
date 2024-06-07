import java.util.Scanner;

public class ededNeceMertebelidir {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int eded= scanner.nextInt();
        int i;

        for (i=0;eded>0;i++){

          eded=eded/10;

        }

        System.out.println(i+" mertebeli");
































    }
}
