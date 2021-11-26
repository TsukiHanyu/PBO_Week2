package PendaftaranKursus07341;

public class Member07341 extends BiodataKursus07341 {
    private String password07341;
    
    public Member07341(String password07341, String nama07341, String Alamat07341){
        super(nama07341,Alamat07341);
        this.password07341 = password07341;
    }
    public String getPassword(){
        return password07341;
    }
    public void setPassword (String password07341){
        this.password07341 = password07341;
    }
}

