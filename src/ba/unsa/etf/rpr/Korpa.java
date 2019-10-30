package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] uKorpi = new Artikl[50];
    private int brojArtikala=0;
    public Artikl[] getArtikli(){
        return this.uKorpi;
    }
    public boolean dodajArtikl(Artikl a){
        int i;
        if(brojArtikala==50) System.out.println("Korpa je puna!");
        else{
            for(i=0; i<50; i++){
                if(this.uKorpi[i]==null){
                    this.uKorpi[i]=new Artikl(a);
                    break;
                }
            }
            brojArtikala++;
            return true;
        }
        return false;
    }
    public Artikl izbaciArtiklSaKodom(String s){
        int i;
        Artikl izbaceni=null;
        for(i=0; i<brojArtikala; i++){
            if(this.uKorpi==null) break;
            if(s.equals(this.uKorpi[i].getKod())){
                izbaceni=uKorpi[i];
                uKorpi[i]=null;
                brojArtikala--;
                poredaj(i);
                return izbaceni;
            }
        }
        return izbaceni;
    }
    public void poredaj(int n){
        int i;
        for(i=n; i<49; i++){
            uKorpi[i]=uKorpi[i+1];
        }
    }
    public int dajUkupnuCijenuArtikala(){
        int i;
        int ukupnaCijena=0;
        for(i=0; i<brojArtikala; i++){
            if(this.uKorpi[i]==null) continue;
            ukupnaCijena=ukupnaCijena+uKorpi[i].getCijena();
        }
        return ukupnaCijena;
    }
}
