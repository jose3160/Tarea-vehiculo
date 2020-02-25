/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.vehiculo;

/**
 *
 * @author Manuel
 */
public class tamanio {
    private String tamaño1;
    private String tamaño2;
    private String tamaño3;

    public tamanio() {
    }

    public tamanio(String tamaño1, String tamaño2, String tamaño3) {
        this.tamaño1 = tamaño1;
        this.tamaño2 = tamaño2;
        this.tamaño3 = tamaño3;
    }

    tamanio(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTamaño1() {
        return tamaño1;
    }

    public void setTamaño1(String tamaño1) {
        this.tamaño1 = tamaño1;
    }

    public String getTamaño2() {
        return tamaño2;
    }

    public void setTamaño2(String tamaño2) {
        this.tamaño2 = tamaño2;
    }

    public String getTamaño3() {
        return tamaño3;
    }

    public void setTamaño3(String tamaño3) {
        this.tamaño3 = tamaño3;
    }
    
}
