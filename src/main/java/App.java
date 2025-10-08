package main.java;
import java.util.Scanner;

public class App {
        

    public static void funcao_teste (){
        Scanner ler = new Scanner(System.in); 
        CorpoHumano a = new CorpoHumano(70, 0.07, 1000.0, 1.75);
 
 
 
        System.out.println("massa: "+a.getMassa());
       
        System.out.println("volume: "+a.getValume());
 
        System.out.println("densidade: "+a.getDensidade());
 
        System.out.println("altura: "+a.getAltura());
 
        System.out.println("IMC: "+a.calcularImc());
   
 
        double nova_altura = ler.nextDouble();
        a.setAltura(nova_altura);

       double nova_massa = ler.nextDouble();
       a.setMassa(nova_massa);

        System.out.println("nova massa: "+a.getMassa());
        System.out.println("nova altura: "+a.getAltura());
        System.out.println("novo imc: "+a.calcularImc());
 
 
        ler.close();
       
    }
    public static void main(String[] args) throws Exception {
        funcao_teste();


    }
}
