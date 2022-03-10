/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad.herenciavehiculos_imad_2022;

/**
 *
 * @author imad
 */
public class Turismo extends Vehiculo {

    private int puertas;
    private boolean marchaAutomatica;

    public Turismo(int puertas, boolean marchaAutomatica, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    // métodos ‘get’ de la subclase Turismo. Se omiten los setters
    public int getPuertas() {
        return this.puertas;
    }

    public boolean getMarchaAutomatica() {
        return this.marchaAutomatica;
    }

    @Override
    public String getAtributos() {

        // Llamada al método getAtributos() de la clase Vehiculo
        return super.getAtributos() + " Puertas: " + this.puertas + " Marcha automática: " + this.marchaAutomatica;
    }

}
