package veterinerBirliği;

public class Kopek extends Hayvan{


    private int asiSayisi;
    private String tür;
    private String cins;


    public Kopek(String dogumYili, int seriNo,int asiSayisi, String cins) {
        super(dogumYili, seriNo);
        this.asiSayisi =asiSayisi;
        this.tür ="Köpek";
        this.cins =cins;
    }

    @Override
    public void turunuSoyle() {

        System.out.println("BEN BİR "+ cins+" KOPEGİM BUNLARDA BİLGİLERİM  " +toString());
}

    @Override
    public String toString() {
        return "Kopek{" +
                "asiSayisi=" + asiSayisi +
                ", tür='" + tür + '\'' +
                ", cins='" + cins + '\'' +
                '}';
    }
}
