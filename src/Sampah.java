public class Sampah {

    private String namaJenis;
    private String satuan;
    private double hargaPersatuan;

    public Sampah(String namaJenis, String satuan, double hargaPersatuan) {
        this.namaJenis = namaJenis;
        this.satuan = satuan;
        this.hargaPersatuan = hargaPersatuan;
    }

    public void updateHarga(double hargaBaru) {
        this.hargaPersatuan = hargaBaru;
    }

    public double getHargaPersatuan() {
        return hargaPersatuan;
    }
}
