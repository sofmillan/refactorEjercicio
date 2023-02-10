public class Comparendo {

    public Comparendo(){}

    public void construirFotoMulta(int velocidad, Vehiculo tipoVehiculo){
        int tipoComparendo = calcularComparendo(velocidad, tipoVehiculo);
        String textoCorreo = enviarCorreoFotomulta(tipoVehiculo);
        if(tipoComparendo==-1){
            System.out.println("no hay calculo para el tipo de vehiculo" + tipoVehiculo.getTipo() + "corre: " + textoCorreo);

        }else{
            System.out.println("----el tipo de comparendo es: " + tipoComparendo + " ----cuerpo del correo" + textoCorreo);

        }
    }

    public int calcularComparendo( int velocidad, Vehiculo tipoVehiculo) {
        if (tipoVehiculo.getTipo().equals("Carro") ||
                tipoVehiculo.getTipo().equals("Camion") ||
                tipoVehiculo.getTipo().equals("Mula")) {
            {
                if (velocidad <= tipoVehiculo.getLimiteInfeior()) {
                    return 0;
                } else if (velocidad >= tipoVehiculo.getLimiteIntermedio() && velocidad <= tipoVehiculo.getLimiteSuperior()) {
                    return 1;
                }
                return 2;
            }

        }
        return -1;
    }

    public String enviarCorreoFotomulta(Vehiculo tipoVehiculo){

       if(tipoVehiculo.getTipo().equals("Carro")||
               tipoVehiculo.getTipo().equals("Camion")||
               tipoVehiculo.getTipo().equals("Mula")){
           String cuerpoMensaje = "//enviando correo para el tipo "+tipoVehiculo.getTipo();
           String asunto = "//asunto: comparendo "+tipoVehiculo.getTipo();
           return asunto + cuerpoMensaje;
       }else{
           return "enviando correo con vehículo desconocido";
       }
    }
}
