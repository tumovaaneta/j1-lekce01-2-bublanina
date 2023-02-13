package cz.czechitas.recept;

import cz.czechitas.recept.naradi.*;
import cz.czechitas.recept.suroviny.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Miska cervenaMiska;
        Miska zlutaMiska;
        Mixer mixer;
        Vaha kuchynskaVaha;
        PlechNaPeceni plech;
        ElektrickaTrouba trouba;
        Vajicka vajicka;

        Ovoce ovoce;
        Maslo maslo125g;
        Mouka pytlikMouky;
        Cukr pytlikCukru;
        PrasekDoPeciva prasekDoPeciva;

        cervenaMiska = new Miska("cervenaMiska");
        zlutaMiska = new Miska("zlutaMiska");
        mixer = new Mixer("mixer");
        kuchynskaVaha = new Vaha("vaha");
        plech = new PlechNaPeceni("plech");
        trouba = new ElektrickaTrouba("trouba");

        vajicka = new Vajicka("vajicka");
        ovoce = new Ovoce("ovoce");
        maslo125g = new Maslo("maslo125g");
        pytlikMouky = new Mouka("pytlikMouky");
        pytlikCukru = new Cukr("pytlikCukru");
        prasekDoPeciva = new PrasekDoPeciva("prasekDoPeciva");

        //---------------------------------------------------------------------

        // TODO: Sem napiste recept na bublaninu
        // Pouzivejte napovidani v editoru.
        // Vyskakuje samo nebo pomoci Ctrl+Mezernik

        int pocetVajec = 4;
        for (int i = 0; i < pocetVajec; i++) {
            cervenaMiska.nalozSiJedenKus(vajicka);
        }

        cervenaMiska.nalozSiCelyObsah(pytlikCukru);

        mixer.zamichej(cervenaMiska);


        cervenaMiska.nalozSiCelyObsah(maslo125g);

        kuchynskaVaha.vynulujSeS(zlutaMiska);
        kuchynskaVaha.zjistiHmotnost(zlutaMiska);

        int vahaMouky = 0;
        vahaMouky = vahaMouky++;

//        kuchynskaVaha.zjistiHmotnost(zlutaMiska);
//        for (int i = 0; i > 250; vahaMouky = vahaMouky + 1);{
//            zlutaMiska.nalozSiTrochu(pytlikMouky);}
////
//        kuchynskaVaha.zjistiHmotnost(zlutaMiska);
//

        while (vahaMouky != 250) {
            if (vahaMouky < 250) {
                zlutaMiska.nalozSiTrochu(pytlikMouky);
            } else {
                zlutaMiska.vylozSiTrochu();
            }
            vahaMouky = kuchynskaVaha.zjistiHmotnost(zlutaMiska);
        }

        cervenaMiska.nalozSiObsahJineMisky(zlutaMiska);
        cervenaMiska.nalozSiCelyObsah(prasekDoPeciva);
        mixer.zamichej(cervenaMiska);
        plech.preberSiObsah(cervenaMiska);

        int pocetOvoce = 50;
        for ( int i = 0; i < pocetOvoce; i++ ) {
            plech.posypSeKusem(ovoce);
        }
//        System.out.println(plech.getPocetOvoce());

        trouba.zapniSe(180);
        trouba.nechejPect(5);
        trouba.setPredehrata(true);
        trouba.vlozSiDovnitr(plech);
        trouba.nechejPect(25);
        trouba.vypniSe();
        trouba.vyndejObsahVen();
        System.out.println("Jím bublaninu :)");


    }


}




