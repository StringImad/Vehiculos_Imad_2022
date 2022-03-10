/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imad.herenciavehiculos_imad_2022;

/**
 *
 * @author imad
 */
public class PruebaHerenciaVehiculos {

    public static void main(String[] args) {
// Creación de instancias de la superclase Vehiculo y

// de las subclases Turismo, Deportivo y Furgoneta
        Vehiculo miVehiculo = new Vehiculo(343245L, "4050 ABJ", "VW", "GTI", "Blanco", 100.0);
        Turismo miTurismo = new Turismo(2, false, 345674L, "4060 TUR", "Skoda", "Fabia", "Blanco", 90.0);
        Deportivo miDeportivo = new Deportivo(78654L, "4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000);
        Furgoneta miFurgoneta = new Furgoneta(4333L, "4080 FUR", "Fiat", "Ducato", "Azul", 80.0, 1200, 8);

// invocación del método getAtributos() de cada objeto
// miVehiculo es una instancia de la clase Vehiculo, se
// invoca el método getAtributos() de Vehiculo
        System.out.println("Vehículo : " + miVehiculo.getAtributos());
// miTurismo es una instancia de la clase Turismo, se
        // invoca el método getAtributos() de Turismo
        System.out.println("Turismo " + miTurismo.getAtributos());
// miTurismo es una instancia de la clase Turismo, se
// invoca el método getAtributos() de Turismo
        System.out.println("Turismo " + miTurismo.getAtributos());
// miDeportivo es una instancia de la clase Deportivo,
// se invoca el método getAtributos() de Deportivo
        System.out.println("Deportivo " + miDeportivo.getAtributos());
// miFurgoneta es una instancia de la clase Furgoneta,
// se invoca el método getAtributos() de Furgoneta
        System.out.println("Furgoneta " + miFurgoneta.getAtributos());
// el objeto miTurismo pertenece a la subclase Turismo,
// es un vehículo y puede invocar a los métodos de la
// superclase Vehiculo: getMatricula(),
// getMarca() y getModelo() porque estos métodos son públicos
        System.out.println("Turismo: " + miTurismo.getMatricula() + " " + miTurismo.getMarca() + " " + miTurismo.getModelo());

    }
}
