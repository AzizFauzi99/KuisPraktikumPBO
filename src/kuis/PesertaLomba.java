package kuis;

import perlombaan.LombaAnimasi;
import perlombaan.LombaSurat;

public class PesertaLomba implements LombaAnimasi, LombaSurat{
    int Pilihan;
    double AlurCerita, Konten, Kreativitas1, Sinematografi;
    double StrukturSurat, IsiSurat, Kreativitas2, KaidahBahasa;

    public PesertaLomba(int pilihan, double AlurCerita, double Konten, double Kreativitas1, double Sinematografi) {
        this.AlurCerita = AlurCerita;
        this.Konten = Konten;
        this.Kreativitas1 = Kreativitas1;
        this.Sinematografi = Sinematografi;
        this.Pilihan = pilihan;
    }

    public PesertaLomba(double StrukturSurat, double IsiSurat, double Kreativitas2, double KaidahBahasa) {
        this.StrukturSurat = StrukturSurat;
        this.IsiSurat = IsiSurat;
        this.Kreativitas2 = Kreativitas2;
        this.KaidahBahasa = KaidahBahasa;
    }     
     
    // Lomba Animasi
    @Override
    public double NilaiAlurCerita() {
        return 0.15*AlurCerita;
    }

    @Override
    public double NilaiKonten() {
        return 0.35*Konten;
    }

    @Override
    public double NilaiKreativitas1() {
        return 0.35*Kreativitas1;
    }

    @Override
    public double NilaiSinematografi() {
        return 0.15*Sinematografi;
    }
    
    @Override
    public double NilaiAkhirAnimasi() {
        return NilaiAlurCerita()+NilaiKonten()+ NilaiKreativitas1()+ NilaiSinematografi();
    }
    
    // Lomba Surat
    @Override
    public double NilaiStrukturSurat() {
        return 0.1*StrukturSurat;
    }

    @Override
    public double NilaiIsiSurat() {
        return 0.4*IsiSurat;
    }
    
    @Override
    public double NilaiKreativitas2() {
        return 0.3*Kreativitas2;
    }

    @Override
    public double NilaiKaidahBahasa() {
        return 0.2*KaidahBahasa;
    }

    @Override
    public double NilaiAkhirSurat() {
        return NilaiStrukturSurat()+NilaiIsiSurat()+NilaiKreativitas2()+NilaiKaidahBahasa();
    }
    
}
