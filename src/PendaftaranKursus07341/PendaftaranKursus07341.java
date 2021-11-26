package PendaftaranKursus07341;
import java.util.Scanner;

public class PendaftaranKursus07341 {
    private static Scanner input = new Scanner(System.in);
    private static PesertaDC07341[] pesertadc07341 = new PesertaDC07341[100];
    private static Member07341[] Member07341 = new Member07341[100];
    private static DaftarDC07341[] terdaftar07341 = new DaftarDC07341[100];
    private static int pilKursus07341;
    private static int jumPeserta07341 = 0;
    private static int cekMember07341;
    
    public static void main (String[] args){
        dataMember07341();
        int pil07341;
        
        do {
            System.out.println("Jumlah Peserta :" + jumPeserta07341);
            System.out.println("1.Login Member EXO");
            System.out.println("2.Lihat Daftar Peserta");            
            pil07341 = input.nextInt();
            input.nextLine();
            switch (pil07341){
                case 1 -> loginMember();
                case 2 -> viewPeserta();               
            }
        }while (pil07341 != 0);
    }
    
    static int dataMember07341() {
        String namaMember07341[] = {"Kimjongin"};
        String passMember07341[] = {"01"};
        String alamatMember07341[] = {"Jln."};
        for (int i = 0;i < namaMember07341.length;i++){
            Member07341[i] = new Member07341(passMember07341[i],namaMember07341[i],alamatMember07341[i]);
        }
        return namaMember07341.length;
    }
    
    static void loginMember(){
        System.out.println("Nama :");
        String nama07341 = input.next();
        System.out.println("Password :");
        String password07341 = input.next();
        cekMember07341 = login(nama07341,password07341);
        System.out.println("Selamat Datang Team EXO  " + Member07341[cekMember07341].getNama());
        int pil07341;
        do{
            System.out.println("Jumlah Peserta :" + jumPeserta07341);
            System.out.println("1. Daftarkan Kursus Dance Peserta");
            System.out.println("2. Ubah Data Peserta");
            System.out.println("3. Liat Daftar Peserta");
            System.out.println("4. Hapus Peserta");
            System.out.println("0. Log out");
            pil07341 = input.nextInt();
            input.nextLine();
            switch (pil07341){
                case 1 -> insertPeserta();
                case 2 -> updatePeserta();
                case 3 -> viewPeserta();
                case 4 -> deletePeserta();                           
            }            
        }while (pil07341 != 0 );
    }
    
    static int login(String nama07341, String password07341){
        int loop =0;
        for (int i = 0 ; i <= dataMember07341(); i++){
            if (Member07341[i].getNama().equals(nama07341)&& Member07341[i].getPassword().equals(password07341)){
                break;
            }else {
                loop++;
            }
        }
        return loop;
    }

    static void insertPeserta(){
        System.out.println("Input Nama :");
        String nama07341 = input.nextLine();
        System.out.println("Input Umur :");
        String umur07341 = input.nextLine();
        System.out.println("Input Alamat :");
        String alamat07341 = input.nextLine();        
        
        pesertadc07341[jumPeserta07341] = new PesertaDC07341(umur07341,nama07341,alamat07341);
        insertKursus();
    }
    
    static void insertKursus(){
        System.out.println("Dance EXO :");
        for (int i =0 ; i < KelompokDance07341.Kursus.length ; i++){
                System.out.println(i + ". " + KelompokDance07341.Kursus[i]);
        }
            System.out.println("Pilih Dance EXO :");
            pilKursus07341 = input.nextInt();
            System.out.println("Input Kode Peserta DC");
            String kodePesertaDC = input.next();
            terdaftar07341[jumPeserta07341] = new DaftarDC07341(pesertadc07341[jumPeserta07341],pilKursus07341,kodePesertaDC);
            jumPeserta07341 = jumPeserta07341 + 1;
    }
  
    static void updatePeserta(){
        System.out.println("Masukkan Kode Peserta yang mau di Edit :");
        String search07341 = input.next();
        int cari =0;
        do{
            if (cari == jumPeserta07341){
                System.err.println("Tidak ada data");
                break;
            }else if (terdaftar07341[cari].getKodePesertaDC().equals(search07341)){
                int pilEdit;
                do{
                    System.out.println("Pilih data yang ingin diubah :");
                    System.out.println("1. Lihat Biodata");
                    System.out.println("2. Nama");
                    System.out.println("3. Alamat");                    
                    System.out.println("4. Umur");
                    System.out.println("5. Sesi Dance EXO");
                    System.out.println("0. Exit");
                    pilEdit = input.nextInt();
                    input.nextLine();
                    if (pilEdit == 1){
                        viewPeserta(cari);
                    }else if (pilEdit == 2){
                        System.out.println("Ubah Nama :");
                        String editNama = input.nextLine();
                        pesertadc07341[cari].setNama(editNama);
                    }else if (pilEdit == 3){
                        System.out.println("Ubah Alamat :");
                        String editAlamat = input.nextLine();
                        pesertadc07341[cari].setAlamat(editAlamat);
                    }else if (pilEdit == 4){
                        System.out.println("Ubah Umur :");
                        String editUmur = input.nextLine();
                        pesertadc07341[cari].setUmur(editUmur);                       
                    }else if (pilEdit == 5){
                        System.out.println("Pilih Sesi Kursus :");
                        for (int i = 0; i <KelompokDance07341.Kursus.length; i++){
                            System.out.println(i + ". " + KelompokDance07341.Kursus[i]);
                        }    
                            System.out.println("Pilih Sesi Kursus :");
                            int editKursus = input.nextInt();
                            terdaftar07341[cari].setKursusindex(editKursus);
                    }                                          
                    }while (pilEdit != 0);
                break;
            }else{
                cari = cari +1;
            }
        }while(true);
    }
  
    static void viewPeserta(){
        if (jumPeserta07341 == 0){
            System.out.println("Belum ada peserta Terdaftar");
        }else{
            for (int i = 0 ; i < jumPeserta07341; i++){
                System.out.println("=========================");
                System.out.println("Kode Peserta :" + terdaftar07341[i].getKodePesertaDC());
                System.out.println("=========================");
                System.out.println("Nama :" + pesertadc07341[i].getNama() + "\nUmur :" + pesertadc07341[i].getUmur() + "\nAlamat :" + pesertadc07341[i].getAlamat() + "\nKelompok Dance :" + KelompokDance07341.Kursus[terdaftar07341[i].getKursusindex()]);
                System.out.println("=========================");
            }
        }
    }
    static void viewPeserta(int cari){
        
        
           
                System.out.println("=========================");
                System.out.println("Kode Peserta :" + terdaftar07341[cari].getKodePesertaDC());
                System.out.println("=========================");
                System.out.println("Nama :" + pesertadc07341[cari].getNama() + "\nUmur :" + pesertadc07341[cari].getUmur() + "\nAlamat :" + pesertadc07341[cari].getAlamat() + "\nKelompok Dance :" + KelompokDance07341.Kursus[terdaftar07341[cari].getKursusindex()]);
                System.out.println("=========================");
            
        
    }
       
    static void deletePeserta(){
        System.out.print("Masukan Kode Peserta yang akan di Hapus :");
        String search07341 = input.next();
        input.nextLine();
        int cari = 0;
        do{
            if (cari == jumPeserta07341){
                System.err.println("Tidak ada Data !");
                break;
            }else if (terdaftar07341[cari].getKodePesertaDC().equals(search07341)){
                if (cari == jumPeserta07341 - 1){
                    jumPeserta07341 = jumPeserta07341 - 1;
                }else {
                    for (int i = cari; i < jumPeserta07341; i++){
                        terdaftar07341[i] = terdaftar07341[i+1];
                        pesertadc07341[i] = pesertadc07341[i+1];
                    }
                    jumPeserta07341 = jumPeserta07341 - 1;
                    }
            break;
            }else {
                cari = cari + 1;
            }
        }while(true);
    }
}