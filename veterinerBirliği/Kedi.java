package veterinerBirliği;

public class Kedi extends Hayvan{

private String  cins;


    public Kedi(String dogumYili, int seriNo,String cins) {
        super(dogumYili, seriNo);
        this.cins =cins;
    }

    @Override
    public void turunuSoyle() {
        System.out.println("Ben bir kediyim bunlarda bilgilerim "+ toString());
    }

    @Override
    public String toString() {
        return super.toString() +" Kedi{" +
                "cins='" + cins + '\'' +
                '}';
    }
}
