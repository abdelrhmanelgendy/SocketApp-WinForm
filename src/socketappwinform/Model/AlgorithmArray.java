/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketappwinform.Model;

/**
 *
 * @author Abd elrahman
 */
public class AlgorithmArray {
    
    String algoritm;
    String[] array;

    public AlgorithmArray(String algoritm, String[] array) {
        this.algoritm = algoritm;
        this.array = array;
    }

    public String getAlgoritm() {
        return algoritm;
    }

    public void setAlgoritm(String algoritm) {
        this.algoritm = algoritm;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }
    
    
    
    
}
