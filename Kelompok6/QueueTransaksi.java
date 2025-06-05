package Kelompok6;

public class QueueTransaksi {
    TransaksiPengisian[] data;
    int front, rear, size;

    public QueueTransaksi(int kapasitas) {
        data = new TransaksiPengisian[kapasitas];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }
    public void enqueue(TransaksiPengisian t) {
        if (isFull()) {
            System.out.println("Queue transaksi penuh. Tidak dapat mencatat transaksi baru.");
            return;
        }
        if (isEmpty()) front = 0;
        rear = (rear + 1) % data.length;
        data[rear] = t;
        size++;
    }

    public void tampilkanRiwayat() {
        if (isEmpty()) {
            System.out.println("Belum ada transaksi.");
            return;
        }
        System.out.println("Daftar Transaksi:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % data.length;
            TransaksiPengisian t = data[index];
            System.out.printf("%s: Rp %.1f\n", t.kendaraan.platNomor, t.totalBayar);
        }
    }

}
