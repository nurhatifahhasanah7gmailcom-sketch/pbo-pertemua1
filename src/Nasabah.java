public class Nasabah {

    private String nama;
    private String idNasabah;
    private String alamat;
    private double saldoTerkumpul;

    public Nasabah(String nama, String idNasabah, String alamat) {
        this.nama = nama;
        this.idNasabah = idNasabah;
        this.alamat = alamat;
        this.saldoTerkumpul = 0;
    }

    public void tambahSaldo(double jumlah) {
        saldoTerkumpul += jumlah;
    }

    public void tampilkanProfil() {
        System.out.println("Nama: " + nama);
        System.out.println("ID Nasabah: " + idNasabah);
        System.out.println("Alamat: " + alamat);
        System.out.println("Saldo: " + saldoTerkumpul);
    }
}