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
    
    public void displayData() {
        System.out.println("Kode Transaksi\tNo Rekening\tSaldo\t\tDebit/Kredit\tFinal Saldo\tTanggal Transaksi\tType");
        for (int i = 0; i < idx; i++) {
            Transaksi[i].tampil();
        }
    }


}

