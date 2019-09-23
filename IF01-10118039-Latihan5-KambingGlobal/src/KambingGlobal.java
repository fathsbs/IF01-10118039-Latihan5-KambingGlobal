/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM :   
 */

public class KambingGlobal {

    //Variabel jumlahKambing menjadi varianel instance
    int jumlahKambing = 88;

    //Method untuk menampilkan jumlah kambing 
    public void getJumlahKambing() {

        System.out.println("Jumlah Kambing : " + jumlahKambing);
    }

    public void tambahJumlahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Anda seteleh ditambah : " + jumlahKambing);
    }

    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();

        //Menampilkan Jumlah Kambing yang ada saat program x berjalan 
        kambingSusu.getJumlahKambing();

        //Menambah Jumlah Kambing
        kambingSusu.tambahJumlahKambing();

        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }

}
