import java.util.Scanner;

public class odev15 {
    public static void main(String[] args) {
        int giris, a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Cin Zodyagi Hesaplamak Icin Dogum Yilinizi Girin : ");
        giris = input.nextInt();

        a = giris % 12;
       
        switch (a) {
            case (0):
                System.out.println("Cin Zodyagi Burcunuz : Maymun");
                break;
            case (1):
                System.out.println("Cin Zodyagi Burcunuz : Horoz");
                break;
            case (2):
                System.out.println("Cin Zodyagi Burcunuz : Kopek");
                break;
            case (3):
                System.out.println("Cin Zodyagi Burcunuz : Domuz");
                break;
            case (4):
                System.out.println("Cin Zodyagi Burcunuz : Fare");
                break;
            case (5):
                System.out.println("Cin Zodyagi Burcunuz : Okuz");
                break;
            case (6):
                System.out.println("Cin Zodyagi Burcunuz : Kaplan");
                break;
            case (7):
                System.out.println("Cin Zodyagi Burcunuz : Tavşan");
                break;
            case (8):
                System.out.println("Cin Zodyagi Burcunuz : Ejderha");
                break;
            case (9):
                System.out.println("Cin Zodyagi Burcunuz : Yilan");
                break;
            case (10):
                System.out.println("Cin Zodyagi Burcunuz : At");
                break;
            case (11):
                System.out.println("Cin Zodyagi Burcunuz : Koyun");
                break;
        }

    }
}
