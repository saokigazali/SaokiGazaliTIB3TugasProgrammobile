package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Burung;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Kucing",
                "Turki","Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut",R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Kucing",
                "Inggris","Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris",R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Kucing",
                "Birma/Myanmar","Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Kucing",
                "Iran", "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke ItaliaR.drawable.cat_persia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Kucing",
                "Thailand","Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Kucing",
                "Rusia", "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Anjing",
                "Inggris","Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Anjing",
                "Alaska,Siberia,Finlandia (daerah bersalju) ","Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Anjing",
                "Indonesia ","Ras anjing asli pulau Bali", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Anjing",
                "Rusia","Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Anjing",
                "Jerman","Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Anjing",
                "Jepang","Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }
    private static List<Burung> initDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung("Perajak", "Burung",
                "Indonesia","Prenjak merupakan nama sekelompok burung kecil yang berasal dari keluarga keluarga Sylviidae.", R.drawable.burung_prenjak));
        burungs.add(new Burung("Pleci", "Burung",
                "Indonesia","Pleci merupakan burung kicua kecil yang populer di Indonesia. Ia juga dikenal sebagai burung kacamata, hal ini karena sebagian besar burung pleci memiliki lingkaran putih disekitar mata yang terlihat seperti kacamata.", R.drawable.burung_pleci));
        burungs.add(new Burung("ovebird", "Burung",
                "Afrika ","ovebird termasuk salah satu jenis burung yang banyak diminati belakangan ini, karena warnanya yang cantik. Lovebird juga dinilai punya karakter setia kepada pasangan.", R.drawable.burung_lebedlovebird));
        burungs.add(new Burung("Kolibri", "Burung",
                "Indonesia","Kolibri merupakan burung pengicau kecil cantik yang sebagian besar hidup di Amerika Selatan dan Utara.", R.drawable.burung_kolibri));
        burungs.add(new Burung("Kenari", "Burung",
                "Makaronesia ","Burung Kenari disukai manusia karena suara yang merdu dan bulu indahnya yang berwarna-warni mulai dari kuning, putih, hijau dan merah.18 Jul 2019", R.drawable.burung_kenari));
        burungs.add(new Burung("Burung Cabai", "Burung",
                "Indonesia","Burung cabai atau burung kemade merupakan burung kecil yang berasal dari keluarga Dicaeidae. Ia memiliki panjang tubuh sekitar 8 cm.", R.drawable.burung_cabai));
        return burungs;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataBurung(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
