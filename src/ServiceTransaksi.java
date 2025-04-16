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
    public void displayDataRekening() {
    System.out.println("No Rekening\tNama\t\tNama Ibu\tNo HP\t\tEmail");
    
    for (int i = 0; i < idx; i++) {
        System.out.println(Transaksi[i].bankAcc.noRekening + "\t" +
        Transaksi[i].bankAcc.nama + "\t\t" +
        Transaksi[i].bankAcc.namaIbu + "\t" +
        Transaksi[i].bankAcc.noHp + "\t" +
        Transaksi[i].bankAcc.email);
    }
}
    

    public void displayData() {
        System.out.println("Kode Transaksi\tNo Rekening\tSaldo\t\tDebit/Kredit\tFinal Saldo\tTanggal Transaksi\tType");
        for (int i = 0; i < idx; i++) {
            Transaksi[i].tampil();
        }
    }

    public void searchByNama(String noRekening) {
        for (int i = 0; i < idx; i++) {
            if (Transaksi[i].bankAcc.noRekening.equalsIgnoreCase(noRekening)) {
                Transaksi[i].tampil();
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    
    }
    public void maxSaldo () {
        if (idx == 0) {
            System.out.println("Data kosong.");
            return;
        }
    
        Transaksi max = Transaksi[0];
        for (int i = 1; i < idx; i++) {
            if (Transaksi[i].finalSaldo > max.finalSaldo) {
                max = Transaksi[i];
            }
        }
    
        System.out.println("Menampilkan Saldo Tertinggi");
        max.tampil();
    }

    public void sortingfinalSaldoASC () {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (Transaksi[j].finalSaldo > Transaksi[j + 1].finalSaldo) {
                    Transaksi temp = Transaksi[j];
                    Transaksi[j] = Transaksi[j + 1];
                    Transaksi[j + 1] = temp;
                }
            }
        }
}

}

