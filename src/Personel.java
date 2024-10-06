class Personel {
    private String ad;
    private String soyad;
    private double maas;
    private int calismaGunu;

    public Personel(String ad, String soyad, double maas, int calismaGunu) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
        this.calismaGunu = calismaGunu;
    }

    public double maasHesapla() {
        return maas; // Temel maaş
    }

    public double primHesapla() {
        int fazlaGun = calismaGunu > 25 ? calismaGunu - 25 : 0;
        return fazlaGun * 1000; // Her fazla gün için 1000 TL prim
    }

    public double toplamMaas() {
        return maasHesapla() + primHesapla();
    }

    @Override
    public String toString() {
        return ad + " " + soyad + " - Toplam Maaş: " + toplamMaas();
    }
}
