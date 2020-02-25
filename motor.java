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
public class motor {
    
    private String camcomb;
    private String filtro;
    private String sistRef;
    private String conexión;
    private String bobina;

    public motor() {
    }

    public motor(String camcomb, String filtro, String sistRef, String conexión, String bobina) {
        
        this.camcomb = camcomb;
        this.filtro = filtro;
        this.sistRef = sistRef;
        this.conexión = conexión;
        this.bobina = bobina;
    }

    

    public String getCamcomb() {
        return camcomb;
    }

    public void setCamcomb(String camcomb) {
        this.camcomb = camcomb;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public String getSistRef() {
        return sistRef;
    }

    public void setSistRef(String sistRef) {
        this.sistRef = sistRef;
    }

    

    public String getConexión() {
        return conexión;
    }

    public void setConexión(String conexión) {
        this.conexión = conexión;
    }

    public String getBobina() {
        return bobina;
    }

    public void setBobina(String bobina) {
        this.bobina = bobina;
    }
    
    
}
