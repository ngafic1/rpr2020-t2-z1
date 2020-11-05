package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl(){
        Supermarket s=new Supermarket();
        s.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        s.dodajArtikl(new Artikl("Kolica", 2000, "2"));
        s.dodajArtikl(new Artikl("Biciklo", 1000, "10"));
        assertEquals(3,s.getBrojArtikala());
    }
    @Test
    void izbaciArtiklSaKodom(){
        Supermarket s=new Supermarket();
        s.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        s.dodajArtikl(new Artikl("Kolica", 2000, "2"));
        s.dodajArtikl(new Artikl("Biciklo", 1000, "10"));
        s.izbaciArtiklSaKodom("10");
        assertEquals(2, s.getBrojArtikala());
    }

}