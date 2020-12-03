package ch.hicoders.jam101.week01.ciftci;

import ch.hicoders.jam101.week01.ciftlik.Inek;
import ch.hicoders.jam101.week01.ciftlik.Tavuk;

public class ciftlik {
    public static void main(String[] args) {

        Tavuk tavuk = new Tavuk();
        tavuk.setMember("cilli");

        Tavuk tavuk1 = new Tavuk();
        tavuk.setMember("cilli2");


        Inek inek = new Inek();
        inek.setMember("BOZO");
        inek.setToplamSayi(1);

        Inek inek2 = new Inek();
        inek2.setMember("BAŞAK");
        inek2.setToplamSayi(2);

        System.out.println(tavuk);
        System.out.println(tavuk1);
        System.out.println(inek.getToplamSayi()+"+" +inek.getMember());
        System.out.println(inek2.getToplamSayi()+"+" +inek2.getMember());



    }
}
