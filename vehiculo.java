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
public class vehiculo {
    private tamanio tamcarro;
    private String modelo;
    private String color;
    private motor partes;
    private chasis conjunto;
    private llanta tipo;
    private generador energía;

    public vehiculo() {
    }

    public vehiculo(tamanio tamcarro, String modelo, String color, motor partes, chasis conjunto, llanta tipo, generador energía) {
        this.tamcarro = tamcarro;
        this.modelo = modelo;
        this.color = color;
        this.partes = partes;
        this.conjunto = conjunto;
        this.tipo = tipo;
        this.energía = energía;
    }

    public tamanio getTamcarro() {
        return tamcarro;
    }

    public void setTamcarro(tamanio tamcarro) {
        this.tamcarro = tamcarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public motor getPartes() {
        return partes;
    }

    public void setPartes(motor partes) {
        this.partes = partes;
    }

    public chasis getConjunto() {
        return conjunto;
    }

    public void setConjunto(chasis conjunto) {
        this.conjunto = conjunto;
    }

    public llanta getTipo() {
        return tipo;
    }

    public void setTipo(llanta tipo) {
        this.tipo = tipo;
    }

    public generador getEnergía() {
        return energía;
    }

    public void setEnergía(generador energía) {
        this.energía = energía;
    }
    
}
