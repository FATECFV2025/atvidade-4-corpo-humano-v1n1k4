package main.java;

public class CorpoHumano {
  private double valume;
    private double densidade;
    private double altura;
   
    private double massa;
    public CorpoHumano(double massa, double valume, double densidade, double altura) {
        this.massa = massa;
        this.valume = valume;
        this.densidade = densidade;
        this.altura = altura;
 
    }
 
    public double getValume() {
        return valume;
    }
    public void setValume(double valume) {
        this.valume = valume;
    }
    public double getDensidade() {
        return densidade;
    }
    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getMassa() {
        return massa;
    }
    public void setMassa(double massa) {
        this.massa = massa;
 
    }
    public double calcularImc(){
        return massa/(altura*altura);
    }
 

}
