package nyatproje;
/**
 *
 * @author mervenuryazanel B171210069
 */
public class Kullanici implements IKullanici{
    
    String kullaniciAdi="merve";
    String sifre="0123";
    
    private Kullanici(){
    
    };
    
    private static Kullanici instance;
    public static Kullanici getInstance(){
        if(instance == null){
            instance = new Kullanici();
        }
        return instance;
    }
    
}
