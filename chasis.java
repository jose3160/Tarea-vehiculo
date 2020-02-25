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
public class chasis {
    private float peso;
    private float rigidezTor;
    
    private String sencilles;

    public chasis() {
    }

    public chasis(float peso, float rigidezTor, String sencilles) {
        this.peso = peso;
        this.rigidezTor = rigidezTor;
        this.sencilles = sencilles;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getRigidezTor() {
        return rigidezTor;
    }

    public void setRigidezTor(float rigidezTor) {
        this.rigidezTor = rigidezTor;
    }

    public String getSencilles() {
        return sencilles;
    }

    public void setSencilles(String sencilles) {
        this.sencilles = sencilles;
    }
    
}
