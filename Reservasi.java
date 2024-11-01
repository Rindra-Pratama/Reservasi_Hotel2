public class Reservasi {
    private Pelanggan pelanggan; 
    private Kamar kamar; 
    private int lamaMenginap; 

    public Reservasi(Pelanggan pelanggan, Kamar kamar, int lamaMenginap) {
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        this.lamaMenginap = lamaMenginap;
    }

    // Menghitung total biaya
    public double hitungTotalBiaya() {
        double totalBiaya = kamar.getHarga() * lamaMenginap; 

        // Menambahkan biaya untuk fasilitas 
        if (kamar.getFasilitas() != null) {
            totalBiaya += kamar.getFasilitas().getHargaFasilitas(); 
        }
        
        return totalBiaya; 
    }

    // detail reservasi
    public void tampilkanReservasi() {
        System.out.println("Pelanggan: " + pelanggan.getNama());
        System.out.println("Kontak: " + pelanggan.getKontak());
        System.out.println("Tipe Kamar: " + kamar.getTipeKamar());
        System.out.println("Nomor Kamar: " + kamar.getNomorKamar());
        System.out.println("Lama Menginap: " + lamaMenginap + " malam");
        
        
        if (kamar.getFasilitas() != null) {
            System.out.println("Fasilitas Tambahan: " + kamar.getFasilitas().getNamaFasilitas() +
                               " - Rp " + kamar.getFasilitas().getHargaFasilitas());
        }
        
        System.out.println("Total Biaya: Rp " + hitungTotalBiaya());
    }
}
