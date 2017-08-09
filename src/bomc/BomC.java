package bomc;
import java.util.*;
public class BomC {
    public static double Salario(double Base, double horas, int multiplicador){
        return Base*horas*multiplicador; 
    }
    public static double SalarioTotal(double Base, double Horas){
        double Aux = 0;
        double horas = Horas;
        if((horas>0)&&(horas<41)){
            Aux = Aux+Salario(Base, horas, 1);
        }else if(horas>40){
            Aux = Aux+Salario(Base, 40, 1);
            horas = Horas - 40;
            if(horas>0){
                if(horas<9){
                    Aux = Aux+Salario(Base, horas, 2);
                }else{
                    Aux = Aux+Salario(Base, 8, 2);
                    horas = Horas - 48;
                    if(horas>0){
                        Aux = Aux+Salario(Base, horas,3);
                    }
                }
            }
        }
        return Aux;
    }
    public static void main(String[] args) {
        double Base, horas;
        String Nombre;
        Scanner flujo = new Scanner(System.in);
        System.out.println("Programa calculador de nómina individual semanal\n\n");
        System.out.println("Inserte nombre del empleado\n");
        Nombre = flujo.next();
        System.out.println("Inserte salario por hora del empleado\n");
        Base = flujo.nextDouble();
        System.out.println("Inserte horas por semana trabajadas por el empleado\n");
        horas = flujo.nextDouble();
        System.out.println("El empleado "+Nombre+" por sus "+horas+" de servicio, merece un pago de "+SalarioTotal(Base, horas)+"\n");
    }
    
}
