package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] supermarket = new Artikl[1000];
    private int brojArtikala=0;
    public Artikl[] getArtikli(){
        return supermarket;
    }
    public Artikl izbaciArtiklSaKodom(String s){
        int i;
        Artikl izbaceni=null;
        for(i=0; i<brojArtikala; i++){
            if(this.supermarket[i]==null){
                izbaceni=null;
                return izbaceni;
            }
            if(s.equals(supermarket[i].getKod())){
                izbaceni=this.supermarket[i];
                this.supermarket[i]=null;
                brojArtikala--;
                poredaj(i);
            }
        }
        return izbaceni;
    }
    public void poredaj(int n){
        int i;
        for(i=n; i<999; i++){
            supermarket[i]=supermarket[i+1];
        }
    }
    public boolean dodajArtikl(Artikl a){
        if(brojArtikala==1000) System.out.println("Supermarket je pun!");
        else{
            int i;
            for(i=0; i<1000; i++){
                if(supermarket[i]==null){
                    supermarket[i]=new Artikl(a);
                    break;
                }
            }
            brojArtikala++;
            return true;
        }
        return false;
    }
}
