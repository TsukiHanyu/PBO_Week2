package PendaftaranKursus07341;

public abstract class BiodataKursus07341 {
    
    protected String nama07341,alamat07341;
    
    public BiodataKursus07341(String nama07341,String alamat07341){
        this.nama07341 = nama07341;
        this.alamat07341 = alamat07341;
    }
    
    public String getNama(){
        return nama07341;        
    }
    
    public void setNama(String nama07341){
        this.nama07341 = nama07341;        
    }
 
    public String getAlamat(){
        return alamat07341;        
    }
    public void setAlamat(String alamat07341){
        this.alamat07341 = alamat07341;
    }
}
