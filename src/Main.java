public class Main {
    public static void main(String[] args) {
        Vehiculo carro1 = new Carro();
        Vehiculo camion1 = new Camion();
        Vehiculo mula1 = new Mula();
        Vehiculo avion1 = new Avion();
        Comparendo comparendo= new Comparendo();
        comparendo.construirFotoMulta(80,carro1);
        comparendo.construirFotoMulta(200,mula1);
        comparendo.construirFotoMulta(40,camion1);
        comparendo.construirFotoMulta(40,avion1);


    }
}