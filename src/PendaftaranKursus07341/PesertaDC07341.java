package PendaftaranKursus07341;

public class PesertaDC07341 extends BiodataKursus07341 {
    private String umur07341;
    
    public PesertaDC07341 (String umur07341,String nama07341,String alamat07341){
        super(nama07341,alamat07341);
        this.umur07341 = umur07341;
    }
    public String getUmur(){
        return umur07341;
    }
    public void setUmur(String umur07341){
        this.umur07341 = umur07341;
    }
}
