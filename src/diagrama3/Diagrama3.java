package diagrama3;

public class Diagrama3 {

    public static void main(String[] args) {
        Laptop laptop_1 = new Laptop();
        laptop_1.marca = "HP";
        laptop_1.modelo = "14001";
        laptop_1.serie = "5cd88eadf";
        laptop_1.precio = 5400;
        laptop_1.estado = "Nuevo";
        laptop_1.obtenerMarca();
        laptop_1.obtenerModelo();
        laptop_1.obtenerSerie();
        laptop_1.obtenerPrecio();
        laptop_1.obtenerEstado();
        
        SmartPhone telefono_1 = new SmartPhone();
        telefono_1.marca = "Samsung";
        telefono_1.modelo = "A21";
        telefono_1.serie = "asd23423423";
        telefono_1.precio = 3500;
        telefono_1.color = "Negro";
        telefono_1.obtenerMarca();
        telefono_1.obtenerModelo();
        telefono_1.obtenerSerie();
        telefono_1.obtenerPrecio();
        telefono_1.obtenerColor();
    }
    
}
