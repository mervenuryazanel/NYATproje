
package nyatproje;

/**
 *
 * @author mervenuryazanel B171210069
 */
public class MerkeziIslemBirimi implements ISogutucuKontrol {
    Sicaklik sicaklik;
    SicaklikAlgilayici sicaklikAlgilayici;
    
    private MerkeziIslemBirimi(){};
    private static MerkeziIslemBirimi instance;
    public static MerkeziIslemBirimi getInstance(){
        if(instance == null){
            instance = new MerkeziIslemBirimi();
        }
        return instance;
    }
    public void sicaklikGoruntuleme(){
        sicaklikAlgilayici=SicaklikAlgilayici.getInstance();
        sicaklikAlgilayici.sicaklikGonder();
        sicaklik=Sicaklik.getInstance();
       System.out.println(sicaklik.rastgeleSicaklikUret()+"°C");
      
    }

    
//    @Override
//    public void update(String mesaj) {
//        System.out.println("Sogutucu "+mesaj);
//    }
//    
     
   
}
