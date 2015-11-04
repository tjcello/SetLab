/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setlab;

import java.util.Comparator;

/**
 *
 * @author tduwe
 */
public class TurkeyByName implements Comparator<Turkey> {
    
    @Override
    public int compare(Turkey e1, Turkey e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
