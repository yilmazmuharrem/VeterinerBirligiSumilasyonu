package veterinerBirliği;

public  abstract class  Kisi {
    private String ad;
    private int tcNo;
    private String cinsiyet;


    public Kisi( String ad,int tcNo,String cinsiyet){
        this.cinsiyet =cinsiyet;
        this.tcNo =tcNo;
        this.ad =ad;
    }


    abstract void kendiniTanıtKisi();


    public int getTcNo() {
        return tcNo;
    }

    public void setTcNo(int tcNo) {
        this.tcNo = tcNo;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "tcNo=" + tcNo +
                ", cinsiyet='" + cinsiyet + '\'' +
                '}';
    }




}
