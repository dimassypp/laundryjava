package Laundry;

public class Run {

    public static void main(String[] args) {
       JenisLaundry laundry = new JenisLaundry();
       Laporan laporan = new Laporan();
       Client client= new Client();
       Transaksi transaksi = new Transaksi();
       laporan.laporan(laundry);
       laporan.laporan(client);
       transaksi.prosesTransaksi(client, transaksi, laundry);
       laporan.laporan(client);
       laporan.laporan(transaksi, laundry, client);
    }
    
}
