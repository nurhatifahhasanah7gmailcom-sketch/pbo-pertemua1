public class Transaksi {

    private String tanggal;
    private String idTransaksi;
    private double berat;
    private double totalNominal;
    private Nasabah nasabah;
    private Sampah sampah;

    public Transaksi(String tanggal, String idTransaksi, double berat, Nasabah nasabah, Sampah sampah) {
        this.tanggal = tanggal;
        this.idTransaksi = idTransaksi;
        this.berat = berat;
        this.nasabah = nasabah;
        this.sampah = sampah;
        this.totalNominal = hitungTotal();
    }

    public double hitungTotal() {
        return berat * sampah.getHargaPersatuan();
    }

    public double getTotalNominal() {
        return totalNominal;
    }
}
