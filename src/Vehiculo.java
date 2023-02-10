public class Vehiculo {
    protected int limiteInferior;
    protected int limiteIntermedio;
    protected int limiteSuperior;

    protected String tipo;
    public Vehiculo(){}
    public Vehiculo(int limiteInfeior, int limiteIntermedio, int limiteSuperior) {
        this.limiteInferior = limiteInfeior;
        this.limiteIntermedio = limiteIntermedio;
        this.limiteSuperior = limiteSuperior;
    }

    public int getLimiteInfeior() {
        return this.limiteInferior;
    }

    public int getLimiteIntermedio() {
        return this.limiteIntermedio;
    }

    public int getLimiteSuperior() {
        return this.limiteSuperior;
    }

    public String getTipo(){return this.tipo;}
}
