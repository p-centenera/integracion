package Aplicacion;
import dominio.*;
public class Principal{
public static void main(String[] args){
    System.out.println("Integral p. medio de x^2+2x+1 en (0,1) : "+Mates.integracionPuntoMedio(x->x*x+2*x+1, 0.0,1.0)+ "(el resultado es 2.66)");
    System.out.println("Integral trapecio de x^2+2x+1 en (0,1): "+Mates.integracionTrapecio(x->x*x+2*x+1, 0.0,1.0)+"(el resultado es 2.66)");
    System.out.println("Integral p. medio de 1/x en (1,2): "+Mates.integracionPuntoMedio(x->1/x, 1.0,2.0)+"(el resultado es 0.69)");
    System.out.println("Integral trapecio de 1/x en (1,2): "+Mates.integracionTrapecio(x->1/x, 1.0,2.0)+"(el resultado es 0.69)");
}
}