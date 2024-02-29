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
    //integración de Simpson
    public static double integracionSimpson(DoubleUnaryOperator f, double a, double b, int n) {
        double h = (b - a) / n;
        double suma_f = 0;
        for (int i = 0; i <= n; i++) {
            double x = a + i * h;
            if (i == 0 || i == n) {
                suma_f += f.applyAsDouble(x);
            } else if (i % 2 == 0) {
                suma_f += 2 * f.applyAsDouble(x);
            } else {
                suma_f += 4 * f.applyAsDouble(x);
            }
        }
        return (h / 3) * suma_f;
    }

    public static double integracionNewton_Cotes(DoubleUnaryOperator f,double a,double b,double n){
        double suma_f=0;
        double h=(b-a)/n;
        int i=0;
        for (double x=a;x<=b;x+=h){
            suma_f+=f.applyAsDouble(x);
            i++;
        }
        return (b-a)*suma_f/i;
    }
    //Integración de Monte Carlo
    public static double integracionMonteCarlo(DoubleUnaryOperator f, double a, double b, int n){
        double suma_f=0;
        for (int i=0;i<n;i++){
            double x=a+Math.random()*(b-a);
            suma_f+=f.applyAsDouble(x);
        }
        return (b-a)*suma_f/n;
    }


}
