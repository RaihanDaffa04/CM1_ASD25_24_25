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
        Bank bank = Transaksi[i].bankAcc;
        System.out.println(bank.noRekening + "\t" +
                           bank.nama + "\t\t" +
                           bank.namaIbu + "\t" +
                           bank.noHp + "\t" +
                           bank.email);
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

}

