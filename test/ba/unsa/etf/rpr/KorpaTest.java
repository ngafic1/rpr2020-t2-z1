package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    @Test
    void dodajArtikl(){
        Korpa k= new Korpa();
        k.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        assertEquals(1000, k.dajUkupnuCijenuArtikala());
    }
    @Test
    void izbaciArtiklsaKodom(){
        Korpa k=new Korpa();
        k.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        k.dodajArtikl(new Artikl("Kolica", 1500, "5"));
        k.izbaciArtiklSaKodom("1");
        assertEquals(1500, k.dajUkupnuCijenuArtikala());
    }

}