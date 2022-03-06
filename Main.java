
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ulang;
        do{
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");

            System.out.print("Pilih : ");
            int pilih = in.nextInt();

            switch(pilih){
                case 1:
                    double p, l, t;
                    System.out.print("Input Panjang\t: ");
                    p = in.nextInt();
                    System.out.print("Input Lebar\t: ");
                    l = in.nextInt();
                    System.out.print("Input Tinggi\t: ");
                    t = in.nextInt();
                    Balok b = new Balok(p, l, t);

                    System.out.println("Luas Persegi Panjang\t\t= " + b.hitungLuas());
                    System.out.println("Keliling Persegi Panjang\t= " + b.hitungKeliling());
                    System.out.println("Volume Balok\t\t\t= " + b.hitungVolume());
                    System.out.println("Luas Permukaan Balok\t\t= " + b.hitungLuasP());
                    break;
                case 2:
                    double r;
                    System.out.print("Input Tinggi\t\t: ");
                    t = in.nextInt();
                    System.out.print("Input Jari - jari\t: ");
                    r = in.nextInt();
                    Tabung tbg = new Tabung(r, t);

                    System.out.println("Luas Lingkaran\t\t= " + tbg.hitungLuas());
                    System.out.println("Keliling Lingkaran\t= " + tbg.hitungKeliling());
                    System.out.println("Volume Tabung\t\t= " + tbg.hitungVolume());
                    System.out.println("Luas Permukaan Tabung\t= " + tbg.hitungLuasP());
            }
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
            ulang = in.nextInt();
        }while(ulang == 1);
    }
}
