package co.edu.sena;

public class Ejercicios {

    public double areaTriangulo(double d1, double d2){
        return (d1 * d1) / 2;
    }
    public double sumarNumeros(double d1, double d2){
        return (d1 + d2);
    }
    public double numeroCuadrado(double d1){
        return (d1 * d1);
    }
    public double euroDolar(double d1){
        return (d1 * 1.08);
    }
    public double cuadradoArea(double d1){
        return (d1 * d1);
    }
    public double cuadradoPerimetro(double d1){
        return (d1 * 4);
    }
    public double cilindroArea(double d1, double d2){
        double basearea = 3.1416 * d1 * d1 ;
        double lateralarea = 2 * 3.1416 * d1 * d2;
        return (basearea + lateralarea);          
    }   
    public double cilindroVolumen(double d1, double d2){
        double basearea = 3.1416 * d1 * d1 ;        
        return (basearea + d2);          
    }   
    public double circuloLongitud(double d1){
        return (2 * 3.1416 * d1);
    }      
    public double circuloArea(double d1){
        return (2 * (d1 * d1));
    }  
    
}
    