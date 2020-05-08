
package nyatproje;

/**
 *
 * @author mervenuryazanel B171210069
 */
public class AkilliCihaz {

    public static void main(String[] args) {
        Durum drm=new Durum();
        Topic tpc=new Topic();
        tpc.attach(drm);
        AgArayuzu a=new AgArayuzu(tpc);
        a.Ekran();
        
    }
    
}

