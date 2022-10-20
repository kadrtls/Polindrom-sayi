import java.util.Scanner;

public class Main {

    static boolean isPolindrom(){
        int temp,reverseNumber=0,lastNumber;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number= scanner.nextInt();
        temp=number;
        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if (reverseNumber==number){
            System.out.println("polindrom bir sayı"+reverseNumber);
            return true;
        }else {
            System.out.println("polindrom bir sayı değil"+reverseNumber);
            return false;
        }
    }

    public static void main(String[] args) {
        isPolindrom();
    }
}