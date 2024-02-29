package dominio;
//importación de la interfaz funcional Function de java
import java.util.function.DoubleUnaryOperator;
public class Mates {
    public static double integracionPuntoMedio(DoubleUnaryOperator f, double a, double b){
        double medio =(a+b)/2;
        double f_medio=f.applyAsDouble(medio);
        return (b-a)*f_medio;
    }
    public static double integracionTrapecio(DoubleUnaryOperator f, double a, double b){
        double f_a=f.applyAsDouble(a);
        double f_b=f.applyAsDouble(b);
        double media=(f_a+f_b)/2;
        return (b-a)*media;
    }
    //integración de simpson


}
