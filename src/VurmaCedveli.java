import java.util.Scanner;

public class VurmaCedveli {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("eded daxil et->");
        int a= scanner.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(a+"*"+i+"="+a*i);
        }



    }
}
