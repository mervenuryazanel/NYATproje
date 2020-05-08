/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyatproje;

/*****
**** @author mervenuryazanel B171210069
*/
import java.text.DecimalFormat;
import java.util.Random;

public class Sicaklik implements ISicaklik{
    public double sicaklik;
    
    private Sicaklik(){};
    private static Sicaklik instance;
    public static Sicaklik getInstance(){
        if(instance == null){
            instance = new Sicaklik();
        }
        return instance;
    }
    public String rastgeleSicaklikUret(){
    Random r=new Random();
    double min = -20D;
    double max = 10D;
    double generatedDouble = (min + r.nextDouble() * (max - min));

    DecimalFormat df = new DecimalFormat("###.##");
   // System.out.println(df.format(generatedDouble)+"°C");

    return df.format(generatedDouble);
    }
    
}
