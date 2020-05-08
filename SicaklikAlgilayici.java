
package nyatproje;

/**
 *
 * @author mervenuryazanel B171210069
 */
public class SicaklikAlgilayici {
    Sicaklik sicaklik;
    private SicaklikAlgilayici(){};
    private static SicaklikAlgilayici instance;
    public static SicaklikAlgilayici getInstance(){
        if(instance == null){
            instance = new SicaklikAlgilayici();
        }
        return instance;
    }
    private void sicaklikOku(){
       // sicaklik.rastgeleSicaklikUret();
       sicaklik=Sicaklik.getInstance();
       sicaklik.rastgeleSicaklikUret();
    }
    
    void sicaklikGonder(){
        sicaklikOku();
    }
}
