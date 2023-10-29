import java.util.Scanner;

public class KubusVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input panjang sisi kubus
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        // Menghitung volume kubus
        double volume = Math.pow(sisi, 3);

        // Menampilkan hasil
        System.out.println("Volume kubus dengan sisi " + sisi + " adalah " + volume);

        // Menutup scanner
        input.close();
    }
}
