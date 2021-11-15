package veterinerBirliği;

import java.awt.font.TextHitInfo;
import java.util.ArrayList;

public class Musteri extends Kisi{

    private String dogumYeri;
    ArrayList<Hayvan> musteriHayvanlari;

    public Musteri(String ad,int tcNo, String cinsiyet,String  dogumYeri) {
        super(ad,tcNo, cinsiyet);
        this.dogumYeri =dogumYeri;
        musteriHayvanlari =new ArrayList<>();
    }


    public void musteriHayvanlarınaEklemeYap(Hayvan hayvan){
        musteriHayvanlari.add(hayvan);
        System.out.println(hayvan+ "  ***  "+getAd()+" Kullanıcısına Eklendi");
    }

    public void musteriHayvanlariListele(){
        System.out.println(" *** "+getAd()+ " KULLANICIN HAYVANLARI  : ***");
        for (Hayvan hayvan :musteriHayvanlari){
            System.out.println(hayvan);
        }
    }

    public void musteriHayvanSil(Hayvan hayvan){
        musteriHayvanlari.remove(hayvan);
    }



    @Override
    void kendiniTanıtKisi() {
        System.out.println("Ben bir Musteriyim Buda benim bilgilerim "+ toString());
    }

    @Override
    public String toString() {
        return super.toString() +"    Musteri{" +
                "dogumYeri='" + dogumYeri + '\'' +
                ", musteriHayvanlari=" + musteriHayvanlari +
                '}';
    }
}
