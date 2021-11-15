package veterinerBirliği;

public class Main {
   public static void main(String[] args) {


       System.out.println("asdasdas");
       Kedi k1 = new Kedi("01-02-2020", 65, "Van Kedisi");
       Kedi k2 = new Kedi("07-03-2015", 22, "ANKARA KEDİSİSİ");
       Kedi k3 = new Kedi("06-09-2018", 34, "YERLİ KEDİ");

       k1.turunuSoyle();


       Kopek kopek1 = new Kopek("04-03-2002", 12, 1, "Golden");
       Kopek kopek2 = new Kopek("06-02-2015", 87, 1, "Sokak");
       Kopek kopek3 = new Kopek("10-09-220", 23, 1, "Pitbull");

       kopek1.turunuSoyle();


       Musteri m1 = new Musteri("MUHARREM", 1212, "ERKEK", "VAN");
       Musteri m2 = new Musteri("ELİF", 1462, "BELİRTİLMEDİ", "ANKARA");
       Musteri m3 = new Musteri("RIZA", 9238, "KADIN", "ELAZIĞ");

       m1.musteriHayvanlarınaEklemeYap(kopek1);
       m1.musteriHayvanlarınaEklemeYap(kopek2);
       m1.musteriHayvanlarınaEklemeYap(k1);


       m1.musteriHayvanlariListele();


       m1.musteriHayvanSil(kopek1);

       System.out.println();

       m1.musteriHayvanlariListele();


       Veteriner v1 = new Veteriner("Halis Demir", 1212122, "erkek", "FIRAT ÜNİVERSİTESİ");
       Veteriner v2 = new Veteriner("Dilruba Kaya", 98765, "kadın", "Yüzüncü Yıl Üniversitesi");
       Veteriner v3 = new Veteriner("Mesut Akbulut", 48624, "erkek", "Mersin Üniversitesi .....");

       v1.kendiniTanıtKisi();
       v1.VeterinereMusteriEkle(m1);
       v1.VeterinereMusteriEkle(m3);
       v1.VeterinereMusteriEkle(m2);
       v1.veterinerMusteriListele();


   }
}
