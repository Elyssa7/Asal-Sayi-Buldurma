import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean asal = true;
        int input;
        do {
            System.out.println("sayi giriniz");
            input = scan.nextInt();
        }while (input <2 );

        for (int i = 2; i < input ; i++){
            if ( input % i == 0){
                asal = false;
                break;
            }
        }
        if ( asal){
            System.out.println("girilen " + input + " sayısı asaldır");
        } else {
            System.out.println("girilen " + input + " sayısı asal değildir");
        }

    }
}