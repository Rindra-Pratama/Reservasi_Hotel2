public class Fasilitas {
    private String namaFasilitas;
    private double hargaFasilitas; 

    // Constructor
    public Fasilitas(String namaFasilitas) {
        this.namaFasilitas = namaFasilitas;
        this.hargaFasilitas = setHargaFasilitas(namaFasilitas);
    }

    // Method untuk menetapkan harga  fasilitas
    private double setHargaFasilitas(String namaFasilitas) {
        switch (namaFasilitas) {
            case "Sarapan":
                return 100000;
            case "WiFi":
                return 50000;
            case "tanpa fasilitas":
                return 0;
            
            default:
                return 0; // Jika tidak ada fasilitas yang valid
        }
    }

    // Getter 
    public String getNamaFasilitas() {
        return namaFasilitas;
    }
    public double getHargaFasilitas() {
        return hargaFasilitas;
    }
}
