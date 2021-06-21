/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author dania
 */
public class Teclado {
    private String marca;
    private String modelo;
    private int numeeroDeTeclas;
    private int multimedia;

    public Teclado() {
    }

    public Teclado(String marca, String modelo, int numeeroDeTeclas, int multimedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeeroDeTeclas = numeeroDeTeclas;
        this.multimedia = multimedia;
    }

    public int getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(int multimedia) {
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeeroDeTeclas() {
        return numeeroDeTeclas;
    }

    public void setNumeeroDeTeclas(int numeeroDeTeclas) {
        this.numeeroDeTeclas = numeeroDeTeclas;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", modelo=" + modelo + ", numeeroDeTeclas=" + numeeroDeTeclas + ", multimedia=" + multimedia + '}';
    }
    
}
