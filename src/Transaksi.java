public class Transaksi {

        String kodeTransaksi;
        double saldo;
        double inOutSaldo; 
        double finalSaldo;
        String tanggalTransaksi;
        String type;
        Bank bankAcc = new Bank();    

        public Transaksi(String kodeTransaksi, double saldo, double inOutSaldo, double finalSaldo, String tanggalTransaksi, String type, Bank bankAcc ) {
            this.kodeTransaksi = kodeTransaksi;
            this.saldo = saldo;
            this.inOutSaldo = inOutSaldo;
            this.finalSaldo = finalSaldo;
            this.tanggalTransaksi = tanggalTransaksi;
            this.type = type;
            this.bankAcc = bankAcc;

        }
    
        public void tampil() {
            System.out.println("kode transaksi: " + kodeTransaksi );
            System.out.println("saldo: " + saldo);
            System.out.println("in out saldo: " + inOutSaldo);
            System.out.println("final saldo: " + finalSaldo);
            System.out.println("tanggal transaksi: " + tanggalTransaksi);
            System.out.println("type: " + type);
            System.out.println("Data Rekening: ");
            bankAcc.tampil();
            System.out.println("---------------------------");
        }
    }
    
