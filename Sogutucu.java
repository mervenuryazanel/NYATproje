
package nyatproje;

/**
 *
 * @author mervenuryazanel B171210069
 */
public class Sogutucu implements ISogutucu{
    public boolean SogutucuMod;
    private Sogutucu(){
        SogutucuMod=false;
    }
    
    private static Sogutucu instance;
    public static Sogutucu getInstance(){
        if(instance == null){
            instance = new Sogutucu();
        }
        return instance;
    }
}
