/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rep1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 92019562
 */
public class Rep1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //double[] myNumbers = new double[3]   ;
        
        //double[] myNumbers={3.14, 2.72,1.13};   
        
        ArrayList myNumbers = new ArrayList();
        
        myNumbers.add(3.14);
        myNumbers.add(2.72);
        myNumbers.add(1.13);
               
        
        
        Iterator it= myNumbers.iterator();
        
        while (it.hasNext()){
            System.out.println(it.next());
        }
        
    }
    
}
