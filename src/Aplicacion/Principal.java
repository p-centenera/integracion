package Aplicacion;
import dominio.*;
public class Principal{
public static void main(String[] args){
    System.out.println("Integral p. medio de x^2+2x+1 en (0,1) : "+Mates.integracionPuntoMedio(x->x*x+2*x+1, 0.0,1.0)+ "(el resultado es 2.33)");
    System.out.println("Integral trapecio de x^2+2x+1 en (0,1): "+Mates.integracionTrapecio(x->x*x+2*x+1, 0.0,1.0)+"(el resultado es 2.33)");
    System.out.println("Integral Simpson de x^2+2x+1 en (0,1): "+Mates.integracionSimpson(x->x*x+2*x+1, 0.0,1.0,20)+"(el resultado es 2.33)");
    System.out.println("Integral Newton de x^2+2x+1 en (0,1) : "+Mates.integracionNewton_Cotes(x->x*x+2*x+1, 0.0,1.0,20)+"(el resultado es 2.33)");
    System.out.println("Integral Monte Carlo de x^2+2x+1 en (0,1): "+Mates.integracionMonteCarlo(x->x*x+2*x+1, 0.0,1.0,100000)+"(el resultado es 2.33)");
    System.out.println("Integral p. medio de 1/x en (1,2): "+Mates.integracionPuntoMedio(x->1/x, 1.0,2.0)+"(el resultado es 0.69)");
    System.out.println("Integral trapecio de 1/x en (1,2): "+Mates.integracionTrapecio(x->1/x, 1.0,2.0)+"(el resultado es 0.69)");
    System.out.println("Integral Simpson de 1/x en (1,2): "+Mates.integracionSimpson(x->1/x, 1.0,2.0,20)+"(el resultado es 0.69)");
    System.out.println("Integral Newton de 1/x en (1,2): "+Mates.integracionNewton_Cotes(x->1/x, 1.0,2.0,20)+"(el resultado es 0.69)");
    System.out.println("Integral Monte Carlo de 1/x en (1,2): "+Mates.integracionMonteCarlo(x->1/x, 1.0,2.0,100000)+"(el resultado es 0.69)");
}
}