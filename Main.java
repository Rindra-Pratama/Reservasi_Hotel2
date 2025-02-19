import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data_pelanggan.
        System.out.print("Masukkan nama Pelanggan: ");
        String namaTamu = scanner.nextLine();

        System.out.print("Masukkan nomor kontak Pelanggan: ");
        String kontakTamu = scanner.nextLine();
        Pelanggan pelanggan = new Pelanggan(namaTamu, kontakTamu);

        // Pilihan_tipe_kamar
        System.out.println("Pilih tipe kamar:");
        System.out.println("1. Suite Room");
        System.out.println("2. Standard Room");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihanKamar = scanner.nextInt();

        System.out.print("Masukkan lama menginap (dalam malam): ");
        int lamaMenginap = scanner.nextInt();

        Kamar kamar;
        if (pilihanKamar == 1) {
            kamar = new SuiteRoom(1); 
        } else {
            kamar = new StandardRoom(2); 
        }

        
        System.out.println("Pilih fasilitas tambahan:");
        System.out.println("1. Sarapan (100k)");
        System.out.println("2. Wifi (50k)");
        System.out.println("3. Tanpa Fasilitas");
        System.out.print("Masukkan pilihan fasilitas (1/2/3): ");
        int pilihanFasilitas = scanner.nextInt();

        // fasilitas_pilihan
        Fasilitas fasilitas = null;
        switch (pilihanFasilitas) {
            case 1:
                fasilitas = new Fasilitas("Sarapan");
                break;
            case 2:
                fasilitas = new Fasilitas("WiFi");
                break;
            case 3:
                fasilitas = new Fasilitas("Tanpa fasilitas");
                break;
            
            default:
                System.out.println("Pilihan fasilitas tidak valid.");
        }

        // Menetapkan_fasilitas_Kekamar_jika_ada
        if (fasilitas != null) {
            kamar.setFasilitas(fasilitas);
        }

        // reservasi
        Reservasi reservasi = new Reservasi(pelanggan, kamar, lamaMenginap);
        reservasi.tampilkanReservasi();

        scanner.close();
    }
}
