package PendaftaranKursus07341;

public class DaftarDC07341 {
    private PesertaDC07341 pesertadc07341;
    private int Kursusindex07341;
    private String kodePesertaDC07341;
    
    public DaftarDC07341(PesertaDC07341 pesertadc07341, int Kursusindex07341,String kodePesertaDC07341){
        this.pesertadc07341 = pesertadc07341;
        this.Kursusindex07341 = Kursusindex07341;
        this.kodePesertaDC07341 = kodePesertaDC07341;
    }
    
    public PesertaDC07341 getPeserta(){
        return pesertadc07341;
    }
    public void setPeserta(PesertaDC07341 pesertadc07341){
        this.pesertadc07341 = pesertadc07341;
    }
    public int getKursusindex(){
        return Kursusindex07341;
    }
    public void setKursusindex(int Kursusindex07341){
        this.Kursusindex07341 = Kursusindex07341;
    }
    public String getKodePesertaDC(){
        return kodePesertaDC07341;
    }
    public void setKodePesertaDC(String kodePesertaDC07341){
        this.kodePesertaDC07341 = kodePesertaDC07341;
    }
}
