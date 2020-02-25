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
public class generador {
    private float gasolina;
    private float disel;
    private float electricidad;

    public generador() {
    }

    public generador(float gasolina, float disel, float electricidad) {
        this.gasolina = gasolina;
        this.disel = disel;
        this.electricidad = electricidad;
    }

    public float getGasolina() {
        return gasolina;
    }

    public void setGasolina(float gasolina) {
        this.gasolina = gasolina;
    }

    public float getDisel() {
        return disel;
    }

    public void setDisel(float disel) {
        this.disel = disel;
    }

    public float getElectricidad() {
        return electricidad;
    }

    public void setElectricidad(float electricidad) {
        this.electricidad = electricidad;
    }
    
}
