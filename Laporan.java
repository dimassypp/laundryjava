package Laundry;

public class Laporan {
    public void laporan(JenisLaundry jenisLaundry){
        int x=jenisLaundry.getJmlLaundry();

        System.out.println();
        System.out.println("Daftar Jenis-Jenis Laundry");
        System.out.println();
        System.out.println("Jenis Laundry \tDurasi(hr) \tHarga/kg");
        for (int i = 0; i < x; i++) {
            System.out.println(jenisLaundry.getJenisLaundry(i)+"\t"+
            jenisLaundry.getDurasi(i)+ "hr" +
            "\t" +
            "\t"+ jenisLaundry.getHarga(i) + "/kg");
        }
    }
    public void laporan(Client client){
        int x=client.getJmlClient();

        System.out.println();
        System.out.println("Daftar Client");
        System.out.println();
        System.out.println("Nama \tAlamat \t\tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(client.getNama(i)+"\t"+
            client.getAlamat(i)+"\t"+client.getTelepon(i)+"\t"+
            client.getSaldo(i));
        }
    }

    public void laporan(Transaksi transaksi, JenisLaundry jenisLaundry, Client client){
        int x=transaksi.getJmlTransaksi();

        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("Nama\tJenisLaundry(kg) \tHarga/kg \tJumlah");

        int total=0;
        for (int i = 0; i < x; i++) {
            int jumlah=transaksi.getBanyaknya(i)*jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i));
            total+=jumlah;

            System.out.println(client.getNama(transaksi.getIdClient(i))+"\t"+

            transaksi.getBanyaknya(i)+ "kg"+ "\t" +"\t"+jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i))+ "/kg" + "\t" + "\t"
            + jumlah);
        }
   
    }
  
        }
    

