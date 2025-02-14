public class Producto{
    private String nombre;
    private String ubicacion;
    private int cantidad;
    private double precio;

    public Producto(String nombre, String ubicacion, int cantidad, double precio){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public String toString(){
        return "El producto se llama " + this.nombre + " está en " + this.ubicacion + ", vale " + this.precio + " y hay " + this.cantidad + " unidades.";
    }
    
}