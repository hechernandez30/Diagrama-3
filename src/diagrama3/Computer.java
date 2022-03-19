package diagrama3;

public class Computer {
    //Definimos las variables.
    public String marca;
    public String modelo;
    String serie;
    double precio;
    
    
    
    
    //Definimos los metodos.
    public void obtenerMarca(){
        System.out.println("La marca es " + this.marca + ".");
    }
    public void obtenerModelo(){
        System.out.println("El modelo es " + this.modelo + ".");
    }
    public void obtenerSerie(){
        System.out.println("El numero de serie es " + this.serie + ".");
    }
    public void obtenerPrecio(){
        System.out.println("El precio del equipo es de " + this.precio + ".");
    }
}
