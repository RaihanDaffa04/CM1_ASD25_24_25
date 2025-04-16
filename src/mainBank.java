public class mainBank {
    public static void main(String[] args) {
        ServiceTransaksi layanan = new ServiceTransaksi(5);

        Bank b1 = new Bank("16030927", "Wallace", "Mei Mei", "082-458-264-3263", "wallace@mail.com");






    Transaksi t1 = new Transaksi("Tr005", 500000, 200000, 700000, "23-04-2024", "Kredit", b1);
    Transaksi t2 = new Transaksi("Tr004", 400000, 150000, 550000, "23-04-2024", "Kredit", b2);
    Transaksi t3 = new Transaksi("Tr003", 300000, 300000, 600000, "23-04-2024", "Debit", b3);
    Transaksi t4 = new Transaksi("Tr002", 200000, 100000, 300000, "23-04-2024", "Kredit", b4);
    Transaksi t5 = new Transaksi("Tr001", 200000, 100000, 100000, "23-04-2024", "Debit", b5);

}

}
