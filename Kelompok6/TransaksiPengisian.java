package Kelompok6;

public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;

    double liter, totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
    }

    public void tampilkanInfoTransaksi() {
        System.out.printf("Plat: %s | BBM: %s | Liter: %.2f | Harga/liter: %.2f | Total: %.2f\n", 
            kendaraan.platNomor, bbm.namaBBM, liter, bbm.hargaPerLiter, totalBayar);
    }
}
