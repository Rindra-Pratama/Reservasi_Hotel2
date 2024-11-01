public class StandardRoom extends Kamar {
    // Harga untuk Standard Room
    private static final double HARGA_STANDARD = 500000;

    public StandardRoom(int nomorKamar) {
        super(nomorKamar, "Standard Room", HARGA_STANDARD);
    }
}
