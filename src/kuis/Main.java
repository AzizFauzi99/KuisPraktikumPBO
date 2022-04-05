package kuis;

import java.util.Scanner;

/**
 *
 * @author Aziz Fatih Fauzi
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        double ac,ko,kre,si ;
        String nama;
        String sekolah;
        
        System.out.println("LOMBA APRESIASI PAHLAWAN WANITA INDONESIA OLEH UPNVYK 2022");
        System.out.println("Terdapat 2 Kategori Perlombaan: ");
        System.out.println("    1. Animasi (Tim)");
        System.out.println("    2. Menulis Surat (Individu)");
        System.out.print("Pilih Kategori Perlombaan: ");
        pilih = input.nextInt();
        
        if(pilih == 1){
            System.out.println("===== FORM PENDAFTARAN =====");
            System.out.print("Input Nama    : ");
            nama = input.nextLine();
            nama = input.nextLine();
            System.out.print("Asal Sekolah  : ");
            sekolah = input.nextLine();
            
            System.out.println("");
            System.out.println("----- Form Penilaian -----");
            System.out.println("Keterangan: Nilai yang Valid Berada di antara 0 - 100");
            int x = 0;
            do{
                int z;
                do{
                    z = 0;
                    System.out.print("Nilai Alur Cerita   : ");
                    ac = input.nextDouble();
                    if(ac < 0 || ac > 100){
                        z = 1;
                    }
                }while(z == 1);

                do{
                    z = 0;
                    System.out.print("Nilai Konten        : ");
                    ko = input.nextDouble();
                    if(ko < 0 || ko > 100){
                        z = 1;
                    }
                }while(z == 1);

                do{
                    z = 0;
                    System.out.print("Nilai Kreativitas   : ");
                    kre = input.nextDouble();
                    if(kre < 0 || kre > 100){
                        z = 1;
                    }
                }while(z == 1);

                do{
                    z = 0;
                    System.out.print("Nilai Sinematografi : ");
                    si = input.nextDouble();
                    if(si < 0 || si > 100){
                        z = 1;
                    }
                }while(z == 1);         
                do{
                    System.out.println("+++++ MENU +++++");
                    System.out.println("    1. Tampil");
                    System.out.println("    2. Edit");
                    System.out.println("    3. Exit");
                    System.out.print("Pilih: ");
                    int pilihMenu = input.nextInt();
                    PesertaLomba PL = new PesertaLomba(1, ac, ko, kre, si);
                    if(pilihMenu == 1){
                        System.out.println("\nNilai Akhir : " + PL.NilaiAkhirAnimasi());
                        if(PL.NilaiAkhirAnimasi() >= 85){
                            System.out.println("Keterangan  : LOLOS");
                            System.out.println("Selamat, " + nama + " Dari " + sekolah + " Lolos Seleksi Lomba Animasi\n");
                        }else{
                            System.out.println("Keterangan  : GAGAL");
                            System.out.println("Mohon Maaf, " + nama + " Dari " + sekolah + " Tidak Lolos Seleksi Lomba Animasi\n");
                        }
                    }else if(pilihMenu == 2){
                        System.out.println("\n***** EDIT NILAI *****");
                        break;
                    }else if(pilihMenu == 3){
                        System.out.println("Terima Kasih");
                        x = 1;
                        break;
                    }
                }while(true);
            }while(x == 0);
        }
        else if(pilih == 2){
            System.out.println("===== FORM PENDAFTARAN =====");
            System.out.print("Input Nama    : ");
            nama = input.nextLine();
            nama = input.nextLine();
            System.out.print("Asal Sekolah  : ");
            sekolah = input.nextLine();
            
            System.out.println("");
            System.out.println("----- Form Penilaian -----");
            System.out.println("Keterangan: Nilai yang Valid Berada di antara 0 - 100");
            int x = 0;
            do{
                int z;
                do{
                    z = 0;
                    System.out.print("Nilai Struktur Surat  : ");
                    ac = input.nextDouble();
                    if(ac < 0 || ac > 100){
                        z = 1;
                    }
                }while(z == 1);

                do{
                    z = 0;
                    System.out.print("Nilai Isi Surat       : ");
                    ko = input.nextDouble();
                    if(ko < 0 || ko > 100){
                        z = 1;
                    }
                }while(z == 1);

                do{
                    z = 0;
                    System.out.print("Nilai Kreativitas     : ");
                    kre = input.nextDouble();
                    if(kre < 0 || kre > 100){
                        z = 1;
                    }
                }while(z == 1);

                do{
                    z = 0;
                    System.out.print("Nilai Kaidah Bahasa   : ");
                    si = input.nextDouble();
                    if(si < 0 || si > 100){
                        z = 1;
                    }
                }while(z == 1);    
                do{
                    System.out.println("+++++ MENU +++++");
                    System.out.println("    1. Tampil");
                    System.out.println("    2. Edit");
                    System.out.println("    3. Exit");
                    System.out.print("Pilih: ");
                    int pilihMenu = input.nextInt();
                    PesertaLomba PS = new PesertaLomba(ac, ko, kre, si);
                    if(pilihMenu == 1){
                        System.out.println("\nNilai Akhir : " + PS.NilaiAkhirSurat());
                        if(PS.NilaiAkhirSurat() >= 85){
                            System.out.println("Keterangan  : LOLOS");
                            System.out.println("Selamat, " + nama + " Dari " + sekolah + " Lolos Seleksi Lomba Menulis Surat\n");
                        }else{
                            System.out.println("Keterangan  : GAGAL");
                            System.out.println("Mohon Maaf, " + nama + " Dari " + sekolah + " Tidak Lolos Seleksi Lomba Menulis Surat\n");
                        }
                    }else if(pilihMenu == 2){
                        System.out.println("\n***** EDIT NILAI *****");
                        break;
                    }else if(pilihMenu == 3){
                        System.out.println("Terima Kasih");
                        x = 1;
                        break;
                    }
                }while(true);                
            }while(x == 0);
        }
    }   
}
