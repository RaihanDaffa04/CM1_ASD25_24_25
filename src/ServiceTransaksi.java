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
<<<<<<< HEAD

    public void displayData() {
        System.out.println("Kode Transaksi\tNo Rekening\tSaldo\t\tDebit/Kredit\tFinal Saldo\tTanggal Transaksi\tType");
        for (int i = 0; i < idx; i++) {
            Transaksi[i].tampil();
        }
    }

  
=======
>>>>>>> a73c121ea39f337e2c1efe74d194545f53ee0d75
}

