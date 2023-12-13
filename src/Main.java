import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Name: ");
        String ad = sc.nextLine();
        System.out.print("Password: ");
        String sifre = sc.nextLine();
        if (ad.equals("Admin") && sifre.equals("12345")){
            System.out.println("Daxil oldunuz...");
        } else if ((ad.equals("Admin") && !sifre.equals("12345"))) {
            System.out.println("Sifre yanlisdir..");
            System.out.println("1 -> sifre oldugu kimi qalsin");
            System.out.println("2 -> sifre deyisilsin");
            int value = sc.nextInt();
            sc.nextLine();
            switch (value){
                case 1:
                    System.out.println("Yeniden cehd edin");
                    break;
                case 2:

            System.out.print("New Password: ");
            String yeniSifre = sc.nextLine();
            if (yeniSifre.equals("12345")){
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            }else{
                System.out.println("Şifre oluşturuldu");
        }break;  }}
            else{
            System.out.println("istifadeci adi ve ya sifre dogru deyil...");
        }
    }
}
