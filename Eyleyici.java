/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyatproje;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mervenuryazanel B171210069
 */
public class Eyleyici implements IEyleyici{
    Sogutucu sogutucu;
    private List<IObserver> durumlar = new ArrayList<>();
  
    
    private Eyleyici(){
        sogutucu=Sogutucu.getInstance();
    }
    
    private static Eyleyici instance;
    public static Eyleyici getInstance(){
        if(instance == null){
            instance = new Eyleyici();
        }
        return instance;
    }
    
    public void sogutucuAc(){
        sogutucu.SogutucuMod=true;   
    }
    
    public void sogutucuKapat(){
        sogutucu.SogutucuMod=false;
    }

  

   
    
}
