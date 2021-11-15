package veterinerBirliği;

import org.w3c.dom.html.HTMLIsIndexElement;

import java.util.ArrayList;

public class Veteriner extends Kisi {

    private  String mezunOlduguOkul;

   private ArrayList<Musteri> veterinerMusterileri;
    public Veteriner(String ad, int tcNo, String cinsiyet,String mezunOlduguOkul) {
        super(ad, tcNo, cinsiyet);
        this.mezunOlduguOkul =mezunOlduguOkul;
        this.veterinerMusterileri =new ArrayList<>();

    }

    @Override
    void kendiniTanıtKisi() {
        System.out.println(getAd()+ " ben bir VETERİNERİM  BUNLARDA BİLGİLERİM "+toString());
    }


    public void VeterinereMusteriEkle(Musteri musteri){
        veterinerMusterileri.add(musteri);
        System.out.println(getAd()+" VETERİNERİNE "+musteri.getAd()+ " Adlı musteri eklendi ....");
    }
  public  void veterinerMusteriListele(){
        if (veterinerMusterileri.isEmpty()){
            System.out.println(getAd()+ " adlı veterinerin maalesef hiç bir musterisi yok");
        }else {
            System.out.println(" ****** " + getAd() + "ADLI VETERİNERİN MUSTERİLERİ ******");

            for (Musteri musteri : veterinerMusterileri) {
                System.out.println(musteri);
            }
        }
  }

    @Override
    public String toString() {
        return super.toString()+"  Veteriner{" +
                "mezunOlduguOkul='" + mezunOlduguOkul + '\'' +
                '}';
    }
}
