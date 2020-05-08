
package nyatproje;

/**
 *
 * @author mervenuryazanel B171210069
 */
public class Durum implements IObserver {
    @Override
    public void update(String mesaj) {
        System.out.println("Sogutucu " + mesaj);
    }
}
