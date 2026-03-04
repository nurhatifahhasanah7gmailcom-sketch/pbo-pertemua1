public class Main {
    public static void main(String[] args) {

        Nasabah nasabah1 = new Nasabah("Ifa", "N001", "Talun");

        Sampah plastik = new Sampah("Plastik", "Kg", 5000);

        Transaksi transaksi1 = new Transaksi(
                "03-03-2026",
                "T001",
                2.5,
                nasabah1,
                plastik
        );

        double total = transaksi1.getTotalNominal();

        nasabah1.tambahSaldo(total);

        nasabah1.tampilkanProfil();
    }
}