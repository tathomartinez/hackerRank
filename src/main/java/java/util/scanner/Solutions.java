package java.util.scanner;

import java.util.Scanner;

public class Solutions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    public static void formating() {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String clave = sc.next();
            if(clave.length() > 10)
                System.out.println("the size primer valor es superior a 10");
                
            int valor = sc.nextInt();
            if(valor>1000) {
                System.out.println("the size primer valor es superior a 10");
            }
            System.out.printf("%-15s%03d%n", clave,valor);
            
        }
        System.out.println("================================");

}


}
