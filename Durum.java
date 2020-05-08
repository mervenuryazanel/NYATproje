/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
