/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int vector[];
    ArrayList<Integer> list;
    list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int)(Math.random()*100));
        }
    ArrayList<Integer> elderPeople = new ArrayList<>();
        for (Integer value : list) {
            if(value<=70)continue;
            elderPeople.add(value);
        }
        for (Integer value : elderPeople) {
            System.out.println(value);
        }
}
}
