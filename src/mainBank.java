public class mainBank {
    public static void main(String[] args) {
        ServiceTransaksi layanan = new ServiceTransaksi(5);

        Bank b1 = new Bank("16030927 3084", "Wallace", "Mei Mei", "082-458-264-3263", "wallace@mail.com");
        Bank b2 = new Bank("16100617 0573", "Darius", "Susanti", "081-357-843-0547", "darius@pt.org");
        Bank b3 = new Bank("16240401 2243", "Fuller", "Rosalia", "085-556-712-7062", "fuller@mail.org");
        Bank b4 = new Bank("16270525 0112", "Maria", "Krabela", "082-267-223-0234", "maria@gmail.org");
        Bank b5 = new Bank("16101617 2416", "Gery", "Fatimah", "083-683-416-8323", "gery@gery.org");

        Transaksi t1 = new Transaksi("Tr005", 500000, 200000, 700000, "23-04-2024", "Kredit", b1);
        Transaksi t2 = new Transaksi("Tr004", 400000, 150000, 550000, "23-04-2024", "Kredit", b2);
        Transaksi t3 = new Transaksi("Tr003", 300000, 300000, 600000, "23-04-2024", "Debit", b3);
        Transaksi t4 = new Transaksi("Tr002", 200000, 100000, 300000, "23-04-2024", "Kredit", b4);
        Transaksi t5 = new Transaksi("Tr001", 200000, 100000, 100000, "23-04-2024", "Debit", b5);
        

    }

}