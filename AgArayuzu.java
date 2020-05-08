
package nyatproje;

import java.util.Scanner;

/**
 *
 * @author mervenuryazanel B171210069
 */
public class AgArayuzu {
    ISubject publisher;
    
    String kullaniciAdi;
    String sifre;
    boolean sogutucuMod;
    
    private ISogutucuKontrol sKontrol;
    private IKullanici kullanici;
    //Kullanici kullanici=new Kullanici();
    private IEyleyici acKapa;
    //Eyleyici acKapa=new Eyleyici();
    private ISogutucu sogutucu;
    //Sogutucu sogutucu=new Sogutucu();
    ISubject eyleyici ;
    
    public AgArayuzu(ISubject publisher){
          
          sKontrol=MerkeziIslemBirimi.getInstance();
          kullanici=Kullanici.getInstance();
          acKapa=Eyleyici.getInstance();
          sogutucu=Sogutucu.getInstance();
          this.publisher=publisher;
    }
    boolean kullaniciDogrulama(){
        Scanner in = new Scanner(System.in);
        System.out.println("Kullanici adi: ");
        kullaniciAdi = in. nextLine();
        System.out.println("sifre: ");
        sifre = in. nextLine();
        
        if(kullaniciAdi.equals(kullanici.kullaniciAdi) &&sifre.equals(kullanici.sifre)){
            System.out.println("dogrulama basarili..");
            return true;
        }
        else{
            System.out.println("kullanici dogrulamasi basarisiz..");
            return false;
        }
        
        
    }
    
    
    void Ekran(){
        
        int modSecim;
        char secim;
        System.out.println("Menuyu goruntulemek icin kullanici bilgilerinizi giriniz");
        
        if(kullaniciDogrulama()==true){
        do{
        System.out.println("**************MENU**************\n1-Sicaklik goruntule \n2-Sogutucuyu ac \n3-Sogutucuyu kapat");
        Scanner in=new Scanner(System.in);
        modSecim = in. nextInt();
        switch(modSecim) {
        case 1:
             sKontrol.sicaklikGoruntuleme();
             
             break;
        case 2:
              acKapa.sogutucuAc();
              publisher.notify("acildi");
              
         break;
         case 3:
             acKapa.sogutucuKapat();
             publisher.notify("kapatildi.");
         break;
         
        default: 
            System.out.println("gecersiz secim!");
            break;
        
          }
        
            System.out.println("baska bir islem yapmak istiyor musunuz? (E/H)");
            secim = in. next().charAt(0);
            if(secim=='H'||secim=='h'){
                break;
            }
    }while(secim=='E'||secim=='e');
      
        }
        else{
            System.out.println("sadece yetkili kullanicilar islem yapabilir!");
        }
        
}

  
    
}
