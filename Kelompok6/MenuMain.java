package Kelompok6;

import java.util.Scanner;

public class MenuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKendaraan antrian = new AntrianKendaraan();
        QueueTransaksi transaksi = new QueueTransaksi(100);

        int pilihan;
        do {
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = sc.nextLine();
                    Kendaraan k = new Kendaraan(plat, tipe, merk);
                    antrian.tambahAntrian(k);
                    break;
                case 2:
                    System.out.println("\n-- Antrian Kendaraan --");
                    antrian.tampilkanAntrian();
                    break;
                case 3:
                    System.out.println(">> Jumlah kendaraan dalam antrian: " + antrian.hitungAntrian());
                    break;
                case 4:
                    Kendaraan layanan = antrian.layaniKendaraan();
                    if (layanan != null) {
                        System.out.print("Masukkan Jenis BBM: ");
                        String bbmName = sc.nextLine();
                        System.out.print("Masukkan Harga per liter: ");
                        double harga = sc.nextDouble();
                        System.out.print("Masukkan Jumlah liter: ");
                        double liter = sc.nextDouble();
                        sc.nextLine(); 
                        BBM bbm = new BBM(bbmName, harga);
                        TransaksiPengisian tr = new TransaksiPengisian(layanan, bbm, liter);
                        transaksi.enqueue(tr);
                        System.out.println(">> Transaksi berhasil dicatat.");
                    }
                    break;
                case 5:
                    System.out.println("\n-- Riwayat Transaksi --");
                    transaksi.tampilkanRiwayat();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }
}
