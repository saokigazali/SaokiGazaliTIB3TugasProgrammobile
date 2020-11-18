package simple.example.hewanpedia.model;

public class Hewan {
    private String ras;
    private String jenis;
    private String asal;
    private String deskripsi;
    private int drawableRes;

    public Hewan(String ras,String jenis,  String asal, String deskripsi, int drawableRes) {

        this.ras = ras;
        this.jenis = jenis;
        this.asal = asal;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }


    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }

}
