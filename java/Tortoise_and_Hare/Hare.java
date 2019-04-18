public class Hare extends Animal{

    private  int konum;

    public Hare(String adi, String sinifi) {
        super(adi, sinifi);
        konum=0;
    }

    public int getKonum() {
        return konum;
    }

    public void setKonum(int konum) {
        this.konum = konum;
    }

    public  void ileriGit(int kareSayisi){
        this.konum+=kareSayisi;
        if(this.konum>=70){
            this.konum=69;
        }
    }

    public  void geriGit(int kareSayisi){
        if(konum>kareSayisi){
            this.konum-=kareSayisi;

        }
        else{
            konum=0;
        }
    }

}
