package ch.hicoders.jam101.week01.ciftlik;

public class Tavuk {
    private String member;
    private static int toplamSayi;

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public static int getToplamSayi() {
        return toplamSayi;
    }

    public static void setToplamSayi(int toplamSayi) {
        Tavuk.toplamSayi = toplamSayi;
    }
}
