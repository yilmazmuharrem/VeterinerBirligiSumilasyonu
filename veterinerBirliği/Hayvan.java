package veterinerBirliği;

public abstract class Hayvan {

    private String dogumYili;
    private  int seriNo;

    public Hayvan(String dogumYili, int seriNo){
        this.dogumYili =dogumYili;
        this.seriNo =seriNo;
    }


    abstract public void turunuSoyle();

    @Override
    public String toString() {
        return "Hayvan{" +
                "dogumYili='" + dogumYili + '\'' +
                ", seriNo=" + seriNo +
                '}';
    }
}
