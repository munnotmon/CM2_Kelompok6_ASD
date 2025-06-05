package Kelompok6;

public class AntrianKendaraan {
    Node head, tail;

    public void tambahAntrian(Kendaraan k) {
        Node baru = new Node(k);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        System.out.println(">> Kendaraan masuk ke dalam antrian.");
    }

    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Antrian Kendaraan:");
        Node temp = head;
        while (temp != null) {
            System.out.println("Plat Nomor: " + temp.data.platNomor);
            System.out.println("Tipe: " + temp.data.tipe);
            System.out.println("Merk: " + temp.data.merk);
            temp = temp.next;
        }
    }

    public int hitungAntrian() {
        int jumlah = 0;
        Node temp = head;
        while (temp != null) {
            jumlah++;
            temp = temp.next;
        }
        return jumlah;
    }

    public Kendaraan layaniKendaraan() {
        if (head == null) {
            System.out.println("Antrian kosong. Tidak ada kendaraan yang bisa dilayani.");
            return null;
        }
        Kendaraan dilayani = head.data;
        head = head.next;
        if (head == null) tail = null;
        System.out.println("Petugas Melayani " + dilayani.platNomor);
        return dilayani;
    }
}
