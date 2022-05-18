package test;

import XML.ChargeurMagasin;
import donnees.ComparateurArtiste;
import donnees.ComparateurCd;
import donnees.ComparateurNomCd;
import donnees.Magasin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
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

    @Test
    public void testTriCdOk() throws FileNotFoundException {
        //preparation des donnée
        ChargeurMagasin charg = new ChargeurMagasin("E:\\etude informatique\\S2\\Conception objet\\-2022_coo_cd_hergott_bastien\\source XML");
        Magasin mag = charg.chargerMagasin();
        String s1 = "--------------------------------------\n" +
                "Justin Bieber - Believe (13 pistes)\n" +
                "   .01. All Around the World (4:03)\n" +
                "   .02. Boyfriend (2:52)\n" +
                "   .03. As Long as You Love Me (3:49)\n" +
                "   .04. Take You (3:40)\n" +
                "   .05. Right Here (3:24)\n" +
                "   .06. Catching Feelings (3:54)\n" +
                "   .07. Die in Your Arms (3:57)\n" +
                "   .08. Fall (4:08)\n" +
                "   .09. Thought of You (3:50)\n" +
                "   .10. Beauty and the Beat (3:48)\n" +
                "   .11. One Love (3:54)\n" +
                "   .12. Be Alright (3:09)\n" +
                "   .13. Believe (3:42)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Bénabar - Bénabar (12 pistes)\n" +
                "   .01. Bon anniversaire (2:58)\n" +
                "   .02. Y'a une fille qu'habite chez moi (3:52)\n" +
                "   .03. Vélo (2:41)\n" +
                "   .04. Porcelaine (4:13)\n" +
                "   .05. À notre santé (3:18)\n" +
                "   .06. Majorette (5:15)\n" +
                "   .07. Couche tard et lève tôt (3:09)\n" +
                "   .08. Coup du lapin (3:06)\n" +
                "   .09. Saturne (4:17)\n" +
                "   .10. Dramelet (3:28)\n" +
                "   .11. Approchez (2:41)\n" +
                "   .12. À poings fermés (2:53)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Gorillaz - Demon Days (15 pistes)\n" +
                "   .01. Intro (1:03)\n" +
                "   .02. Last Living Souls (3:10)\n" +
                "   .03. Kids With Guns (3:46)\n" +
                "   .04. O Green World (4:32)\n" +
                "   .05. Dirty Harry (3:43)\n" +
                "   .06. Feel Good Inc. (3:41)\n" +
                "   .07. El mañana (3:50)\n" +
                "   .08. Every Planet We Reach Is Dead (4:53)\n" +
                "   .09. November Has Come (2:41)\n" +
                "   .10. All Alone (3:30)\n" +
                "   .11. White Light (2:08)\n" +
                "   .12. DARE (4:04)\n" +
                "   .13. Fire Coming Out of the Monkey’s Head (3:16)\n" +
                "   .14. Don’t Get Lost in Heaven (2:00)\n" +
                "   .15. Demon Days (4:28)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Zebda - Essence ordinaire (13 pistes)\n" +
                "   .01. Y'a pas d'arrangement (4:31)\n" +
                "   .02. Tomber la chemise (4:23)\n" +
                "   .03. Double peine (3:49)\n" +
                "   .04. Tombés des nues (4:40)\n" +
                "   .05. Quinze ans (4:50)\n" +
                "   .06. Je crois que ça va pas être possible (5:36)\n" +
                "   .07. Je suis (4:43)\n" +
                "   .08. Tout semble si… (3:46)\n" +
                "   .09. On est chez nous (3:03)\n" +
                "   .10. Oualalaradime (3:59)\n" +
                "   .11. Le Manouche (4:03)\n" +
                "   .12. Né dans la rue (3:03)\n" +
                "   .13. Le Petit Robert (6:32)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Gorillaz - Gorillaz (15 pistes)\n" +
                "   .01. Re-Hash (3:40)\n" +
                "   .02. 5/4 (2:42)\n" +
                "   .03. Tomorrow Comes Today (3:14)\n" +
                "   .04. New Genious (Brother) (4:00)\n" +
                "   .05. Clint Eastwood (5:41)\n" +
                "   .06. Man Research (Clapper) (4:34)\n" +
                "   .07. Punk (1:38)\n" +
                "   .08. Sound Check (Gravity) (4:42)\n" +
                "   .09. Double Bass (4:47)\n" +
                "   .10. Rock the House (4:11)\n" +
                "   .11. 19-2000 (3:29)\n" +
                "   .12. Latin Simone (Que Pasa Contigo) (3:38)\n" +
                "   .13. Starshine (3:33)\n" +
                "   .14. Slow Country (3:37)\n" +
                "   .15. M1 A1 / Clint Eastwood (Ed Case refix) (10:40)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Bénabar - Les Risques du métier (12 pistes)\n" +
                "   .01. Monospace (2:29)\n" +
                "   .02. Dis-lui oui (3:26)\n" +
                "   .03. Paresseuse (3:32)\n" +
                "   .04. Je suis de celles (3:28)\n" +
                "   .05. Vade retro Téléphone (3:11)\n" +
                "   .06. L'Itinéraire (3:12)\n" +
                "   .07. Sac à main (3:22)\n" +
                "   .08. La station Mir (3:40)\n" +
                "   .09. La coquette (2:42)\n" +
                "   .10. Les mots d'amour (3:12)\n" +
                "   .11. Monsieur René (2:52)\n" +
                "   .12. Le Zoo de Vincennes (3:57)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Céline Dion - Let's Talk About Love (16 pistes)\n" +
                "   .01. The Reason (5:00)\n" +
                "   .02. Immortality (4:11)\n" +
                "   .03. Treat Her Like a Lady (4:05)\n" +
                "   .04. Why Oh Why (4:51)\n" +
                "   .05. Love Is on the Way (4:26)\n" +
                "   .06. Tell Him (4:51)\n" +
                "   .07. Amar haciendo el amor (4:10)\n" +
                "   .08. When I Need You (4:12)\n" +
                "   .09. Miles to Go (Before I Sleep) (4:40)\n" +
                "   .10. Us (5:46)\n" +
                "   .11. Just a Little Bit of Love (4:06)\n" +
                "   .12. My Heart Will Go On (4:40)\n" +
                "   .13. Where Is the Love (4:55)\n" +
                "   .14. Be the Man (On This Night) (4:39)\n" +
                "   .15. I Hate You Then I Love You (4:43)\n" +
                "   .16. Let's Talk About Love (5:15)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Justin Bieber - My Worlds (18 pistes)\n" +
                "   .01. One Time (3:35)\n" +
                "   .02. Favorite Girl (4:16)\n" +
                "   .03. Down to Earth (4:05)\n" +
                "   .04. Bigger (3:17)\n" +
                "   .05. One Less Lonely Girl (3:49)\n" +
                "   .06. First Dance (3:42)\n" +
                "   .07. Love Me (3:13)\n" +
                "   .08. Common Denominator (4:10)\n" +
                "   .09. Baby (3:33)\n" +
                "   .10. Somebody to Love (3:40)\n" +
                "   .11. Stuck in the Moment (3:42)\n" +
                "   .12. U Smile (3:16)\n" +
                "   .13. Runaway Love (3:32)\n" +
                "   .14. Never Let You Go (4:24)\n" +
                "   .15. Overboard (4:11)\n" +
                "   .16. Eenie Meenie (3:22)\n" +
                "   .17. Up (3:54)\n" +
                "   .18. That Should Be Me (3:52)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "The Meters - Rejuvenation (11 pistes)\n" +
                "   .01. People Say (5:18)\n" +
                "   .02. Love Is for Me (3:55)\n" +
                "   .03. Just Kissed My Baby (4:43)\n" +
                "   .04. What'cha Say (3:29)\n" +
                "   .05. Jungle Man (3:26)\n" +
                "   .06. Hey Pocky A-Way (4:06)\n" +
                "   .07. It Ain't No Use (11:51)\n" +
                "   .08. Loving You Is on My Mind (3:19)\n" +
                "   .09. Africa (4:01)\n" +
                "   .10. People Say (single version) (3:11)\n" +
                "   .11. Hey Pocky A-Way (single version) (3:27)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "The Meters - The Meters (14 pistes)\n" +
                "   .01. Cissy Strut (3:06)\n" +
                "   .02. Here Comes the Meter Man (2:55)\n" +
                "   .03. Cardova (4:35)\n" +
                "   .04. Live Wire (2:40)\n" +
                "   .05. Art (2:35)\n" +
                "   .06. Sophisticated Cissy (2:56)\n" +
                "   .07. Ease Back (3:14)\n" +
                "   .08. 6V6 LA (2:26)\n" +
                "   .09. Sehorns Farm (2:31)\n" +
                "   .10. Ann (2:46)\n" +
                "   .11. Stormy (3:40)\n" +
                "   .12. Sing a Simple Song (3:06)\n" +
                "   .13. The Look of Love (3:39)\n" +
                "   .14. Soul Machine (3:28)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "The Rolling Stones - The Rolling Stones (12 pistes)\n" +
                "   .01. (Get Your Kicks on) Route 66 (2:25)\n" +
                "   .02. I Just Wanna Make Love to You (2:21)\n" +
                "   .03. Honest I Do (2:14)\n" +
                "   .04. Mona (I Need You Baby) (3:38)\n" +
                "   .05. Now I’ve Got a Witness (Like Uncle Phil and Uncle Gene) (2:34)\n" +
                "   .06. Little by Little (2:44)\n" +
                "   .07. I’m a King Bee (2:39)\n" +
                "   .08. Carol (2:38)\n" +
                "   .09. Tell Me (You’re Coming Back) (3:52)\n" +
                "   .10. Can I Get a Witness (2:59)\n" +
                "   .11. You Can Make It If You Try (2:06)\n" +
                "   .12. Walking the Dog (3:10)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Whitney Houston - Whitney Houston (10 pistes)\n" +
                "   .01. You Give Good Love (4:37)\n" +
                "   .02. Thinking About You (5:26)\n" +
                "   .03. Someone for Me (5:01)\n" +
                "   .04. Saving All My Love for You (3:58)\n" +
                "   .05. Nobody Loves Me Like You Do (3:49)\n" +
                "   .06. How Will I Know (4:36)\n" +
                "   .07. All at Once (4:29)\n" +
                "   .08. Take Good Care of My Heart (4:16)\n" +
                "   .09. Greatest Love of All (4:51)\n" +
                "   .10. Hold Me (6:00)\n" +
                "--------------------------------------\n" +
                "nb Cds: 12";

        //methode testé
        mag.trier(new ComparateurNomCd());

        Assertions.assertEquals(s1,mag.toString(),"le toString de mag doit etre identique a s1");
    }

    @Test
    public void testTriArtiste() throws FileNotFoundException {
        //preparation des données
        ChargeurMagasin charg = new ChargeurMagasin("E:\\etude informatique\\S2\\Conception objet\\-2022_coo_cd_hergott_bastien\\source XML");
        Magasin mag = charg.chargerMagasin();
        String s1 ="--------------------------------------\n" +
                "Bénabar - Bénabar (12 pistes)\n" +
                "   .01. Bon anniversaire (2:58)\n" +
                "   .02. Y'a une fille qu'habite chez moi (3:52)\n" +
                "   .03. Vélo (2:41)\n" +
                "   .04. Porcelaine (4:13)\n" +
                "   .05. À notre santé (3:18)\n" +
                "   .06. Majorette (5:15)\n" +
                "   .07. Couche tard et lève tôt (3:09)\n" +
                "   .08. Coup du lapin (3:06)\n" +
                "   .09. Saturne (4:17)\n" +
                "   .10. Dramelet (3:28)\n" +
                "   .11. Approchez (2:41)\n" +
                "   .12. À poings fermés (2:53)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Bénabar - Les Risques du métier (12 pistes)\n" +
                "   .01. Monospace (2:29)\n" +
                "   .02. Dis-lui oui (3:26)\n" +
                "   .03. Paresseuse (3:32)\n" +
                "   .04. Je suis de celles (3:28)\n" +
                "   .05. Vade retro Téléphone (3:11)\n" +
                "   .06. L'Itinéraire (3:12)\n" +
                "   .07. Sac à main (3:22)\n" +
                "   .08. La station Mir (3:40)\n" +
                "   .09. La coquette (2:42)\n" +
                "   .10. Les mots d'amour (3:12)\n" +
                "   .11. Monsieur René (2:52)\n" +
                "   .12. Le Zoo de Vincennes (3:57)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Céline Dion - Let's Talk About Love (16 pistes)\n" +
                "   .01. The Reason (5:00)\n" +
                "   .02. Immortality (4:11)\n" +
                "   .03. Treat Her Like a Lady (4:05)\n" +
                "   .04. Why Oh Why (4:51)\n" +
                "   .05. Love Is on the Way (4:26)\n" +
                "   .06. Tell Him (4:51)\n" +
                "   .07. Amar haciendo el amor (4:10)\n" +
                "   .08. When I Need You (4:12)\n" +
                "   .09. Miles to Go (Before I Sleep) (4:40)\n" +
                "   .10. Us (5:46)\n" +
                "   .11. Just a Little Bit of Love (4:06)\n" +
                "   .12. My Heart Will Go On (4:40)\n" +
                "   .13. Where Is the Love (4:55)\n" +
                "   .14. Be the Man (On This Night) (4:39)\n" +
                "   .15. I Hate You Then I Love You (4:43)\n" +
                "   .16. Let's Talk About Love (5:15)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Gorillaz - Gorillaz (15 pistes)\n" +
                "   .01. Re-Hash (3:40)\n" +
                "   .02. 5/4 (2:42)\n" +
                "   .03. Tomorrow Comes Today (3:14)\n" +
                "   .04. New Genious (Brother) (4:00)\n" +
                "   .05. Clint Eastwood (5:41)\n" +
                "   .06. Man Research (Clapper) (4:34)\n" +
                "   .07. Punk (1:38)\n" +
                "   .08. Sound Check (Gravity) (4:42)\n" +
                "   .09. Double Bass (4:47)\n" +
                "   .10. Rock the House (4:11)\n" +
                "   .11. 19-2000 (3:29)\n" +
                "   .12. Latin Simone (Que Pasa Contigo) (3:38)\n" +
                "   .13. Starshine (3:33)\n" +
                "   .14. Slow Country (3:37)\n" +
                "   .15. M1 A1 / Clint Eastwood (Ed Case refix) (10:40)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Gorillaz - Demon Days (15 pistes)\n" +
                "   .01. Intro (1:03)\n" +
                "   .02. Last Living Souls (3:10)\n" +
                "   .03. Kids With Guns (3:46)\n" +
                "   .04. O Green World (4:32)\n" +
                "   .05. Dirty Harry (3:43)\n" +
                "   .06. Feel Good Inc. (3:41)\n" +
                "   .07. El mañana (3:50)\n" +
                "   .08. Every Planet We Reach Is Dead (4:53)\n" +
                "   .09. November Has Come (2:41)\n" +
                "   .10. All Alone (3:30)\n" +
                "   .11. White Light (2:08)\n" +
                "   .12. DARE (4:04)\n" +
                "   .13. Fire Coming Out of the Monkey’s Head (3:16)\n" +
                "   .14. Don’t Get Lost in Heaven (2:00)\n" +
                "   .15. Demon Days (4:28)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Justin Bieber - My Worlds (18 pistes)\n" +
                "   .01. One Time (3:35)\n" +
                "   .02. Favorite Girl (4:16)\n" +
                "   .03. Down to Earth (4:05)\n" +
                "   .04. Bigger (3:17)\n" +
                "   .05. One Less Lonely Girl (3:49)\n" +
                "   .06. First Dance (3:42)\n" +
                "   .07. Love Me (3:13)\n" +
                "   .08. Common Denominator (4:10)\n" +
                "   .09. Baby (3:33)\n" +
                "   .10. Somebody to Love (3:40)\n" +
                "   .11. Stuck in the Moment (3:42)\n" +
                "   .12. U Smile (3:16)\n" +
                "   .13. Runaway Love (3:32)\n" +
                "   .14. Never Let You Go (4:24)\n" +
                "   .15. Overboard (4:11)\n" +
                "   .16. Eenie Meenie (3:22)\n" +
                "   .17. Up (3:54)\n" +
                "   .18. That Should Be Me (3:52)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Justin Bieber - Believe (13 pistes)\n" +
                "   .01. All Around the World (4:03)\n" +
                "   .02. Boyfriend (2:52)\n" +
                "   .03. As Long as You Love Me (3:49)\n" +
                "   .04. Take You (3:40)\n" +
                "   .05. Right Here (3:24)\n" +
                "   .06. Catching Feelings (3:54)\n" +
                "   .07. Die in Your Arms (3:57)\n" +
                "   .08. Fall (4:08)\n" +
                "   .09. Thought of You (3:50)\n" +
                "   .10. Beauty and the Beat (3:48)\n" +
                "   .11. One Love (3:54)\n" +
                "   .12. Be Alright (3:09)\n" +
                "   .13. Believe (3:42)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "The Meters - The Meters (14 pistes)\n" +
                "   .01. Cissy Strut (3:06)\n" +
                "   .02. Here Comes the Meter Man (2:55)\n" +
                "   .03. Cardova (4:35)\n" +
                "   .04. Live Wire (2:40)\n" +
                "   .05. Art (2:35)\n" +
                "   .06. Sophisticated Cissy (2:56)\n" +
                "   .07. Ease Back (3:14)\n" +
                "   .08. 6V6 LA (2:26)\n" +
                "   .09. Sehorns Farm (2:31)\n" +
                "   .10. Ann (2:46)\n" +
                "   .11. Stormy (3:40)\n" +
                "   .12. Sing a Simple Song (3:06)\n" +
                "   .13. The Look of Love (3:39)\n" +
                "   .14. Soul Machine (3:28)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "The Meters - Rejuvenation (11 pistes)\n" +
                "   .01. People Say (5:18)\n" +
                "   .02. Love Is for Me (3:55)\n" +
                "   .03. Just Kissed My Baby (4:43)\n" +
                "   .04. What'cha Say (3:29)\n" +
                "   .05. Jungle Man (3:26)\n" +
                "   .06. Hey Pocky A-Way (4:06)\n" +
                "   .07. It Ain't No Use (11:51)\n" +
                "   .08. Loving You Is on My Mind (3:19)\n" +
                "   .09. Africa (4:01)\n" +
                "   .10. People Say (single version) (3:11)\n" +
                "   .11. Hey Pocky A-Way (single version) (3:27)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "The Rolling Stones - The Rolling Stones (12 pistes)\n" +
                "   .01. (Get Your Kicks on) Route 66 (2:25)\n" +
                "   .02. I Just Wanna Make Love to You (2:21)\n" +
                "   .03. Honest I Do (2:14)\n" +
                "   .04. Mona (I Need You Baby) (3:38)\n" +
                "   .05. Now I’ve Got a Witness (Like Uncle Phil and Uncle Gene) (2:34)\n" +
                "   .06. Little by Little (2:44)\n" +
                "   .07. I’m a King Bee (2:39)\n" +
                "   .08. Carol (2:38)\n" +
                "   .09. Tell Me (You’re Coming Back) (3:52)\n" +
                "   .10. Can I Get a Witness (2:59)\n" +
                "   .11. You Can Make It If You Try (2:06)\n" +
                "   .12. Walking the Dog (3:10)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Whitney Houston - Whitney Houston (10 pistes)\n" +
                "   .01. You Give Good Love (4:37)\n" +
                "   .02. Thinking About You (5:26)\n" +
                "   .03. Someone for Me (5:01)\n" +
                "   .04. Saving All My Love for You (3:58)\n" +
                "   .05. Nobody Loves Me Like You Do (3:49)\n" +
                "   .06. How Will I Know (4:36)\n" +
                "   .07. All at Once (4:29)\n" +
                "   .08. Take Good Care of My Heart (4:16)\n" +
                "   .09. Greatest Love of All (4:51)\n" +
                "   .10. Hold Me (6:00)\n" +
                "--------------------------------------\n" +
                "--------------------------------------\n" +
                "Zebda - Essence ordinaire (13 pistes)\n" +
                "   .01. Y'a pas d'arrangement (4:31)\n" +
                "   .02. Tomber la chemise (4:23)\n" +
                "   .03. Double peine (3:49)\n" +
                "   .04. Tombés des nues (4:40)\n" +
                "   .05. Quinze ans (4:50)\n" +
                "   .06. Je crois que ça va pas être possible (5:36)\n" +
                "   .07. Je suis (4:43)\n" +
                "   .08. Tout semble si… (3:46)\n" +
                "   .09. On est chez nous (3:03)\n" +
                "   .10. Oualalaradime (3:59)\n" +
                "   .11. Le Manouche (4:03)\n" +
                "   .12. Né dans la rue (3:03)\n" +
                "   .13. Le Petit Robert (6:32)\n" +
                "--------------------------------------\n" +
                "nb Cds: 12";

        //methode testé
        mag.trier(new ComparateurArtiste());

        //test
        Assertions.assertEquals(s1,mag.toString(),"le toString de mag doit etre identique a s1");
    }


}