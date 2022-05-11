package test;

import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ChargeurMagasinTest {

    @Test
    public void testChargeurMagasinOK() throws IOException{
        ChargeurMagasin charg = new ChargeurMagasin("E:\\etude informatique\\S2\\Conception objet\\-2022_coo_cd_hergott_bastien\\source XML");

        //methode testé
        Magasin m = charg.chargerMagasin();

        //test
        int nombre = m.getNombreCds();
        Assertions.assertEquals(nombre,12,"le magasin devrait avoir 12 cds");
    }

    @Test
    public void testChargeurMagasinNonOK() throws IOException{
        ChargeurMagasin charg = new ChargeurMagasin("ehgjhbfdslkjhvkdsvf");

        assertThrows(IOException.class, charg::chargerMagasin);
    }


}