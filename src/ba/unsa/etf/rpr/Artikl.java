package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv = "", kod = "";
    private int cijena = 0;
    public Artikl(String naziv, int cijena, String kod){
        this.naziv = naziv; this.cijena = cijena; this.kod = kod;
    }
    public Artikl(Artikl a){
        naziv = a.getNaziv();
        kod = a.getKod();
        cijena = a.getCijena();
    }
    public String getNaziv(){
        return this.naziv;
    }
    public int getCijena(){
        return this.cijena;
    }
    public String getKod(){
        return this.kod;
    }
}
