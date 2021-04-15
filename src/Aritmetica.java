import java.util.Scanner;
public class Aritmetica {
    public static void main(String[] args)  {
        Scanner ent= new Scanner(System.in);
        double x;
        double y;
        double resSuma;
        double resResta;
        double resMult;
        
        System.out.println("Ingrese primer valor: ");
        x=ent.nextDouble();
        System.out.println("Ingrese primer valor: ");
        y=ent.nextDouble();
        resSuma=suma(x,y);
        System.out.println("La suma es: " + resSuma);
        resResta=resta(x,y);
        System.out.println("La resta es: " + resResta);
        resMult=multiplicacion(x,y);
        System.out.println("La Multiplicacion es: " + resMult);
    }
    static double suma(double a, double b)
    {
        
        
        return 1;

    }
    static double resta(double a, double b)
    {
        double res=a-b;
        
        return res;

    }
    static double multiplicacion(double a, double b){
        return a*b;
    }
}