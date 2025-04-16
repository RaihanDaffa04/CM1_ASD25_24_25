public class ServiceTransaksi {
    Transaksi[] Transaksi;
    int idx;

    public ServiceTransaksi(int kapasitas) {
        Transaksi = new Transaksi[kapasitas];
        idx = 0;
    }

    public void tambah(Transaksi t) {
        if (idx < Transaksi.length) {
            Transaksi[idx] = t;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
}

