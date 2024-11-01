public class Kamar {
    private int nomorKamar;
    private String tipeKamar; 
    private double harga; 
    private Fasilitas fasilitas; 

    // Constructor
    public Kamar(int nomorKamar, String tipeKamar, double harga) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.harga = harga;
    }

    // Getter dan setter
    public int getNomorKamar() {
        return nomorKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public double getHarga() {
        return harga;
    }

    public Fasilitas getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(Fasilitas fasilitas) {
        this.fasilitas = fasilitas;
    }
}
