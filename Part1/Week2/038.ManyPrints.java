
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i;
        System.out.println("How many?");
       int times = Integer.parseInt(reader.nextLine());
            
        for (i=0;i<times;i++){
            printText();
        }
    }
}