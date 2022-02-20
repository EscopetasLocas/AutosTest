public class Auto{
    
    // Atributos
    public  int puertas;
    public String noPlaca;
    public float velocidad;
    public byte cilindraje;
    public String marca;
    public String color;

    // Metodos
    public void direccion(int derecha, int izquierda){
        System.out.println("Lado derecho: "+derecha+"\nLado izquierdo: "+izquierda+"\n");
    } 
    public void freno(boolean chino){
        System.out.println("El freno esta activo? " + chino+"\n");
    }
    String X = "Algo";
    public void caracteristicas(String auto){       //Metodo para impresion de atributos incluyendo tipo de Auto
        
        if (faros == true){             // >>>Integracion de condicional para
            X = "encendido";                  // saber si lo faros estan encendidos
        }                                     // o apagados
        else{
            X = "apagado";
        }
        System.out.println("\n\n\n");
        System.out.println("El auto es: " + auto);
        System.out.println("\n");
        System.out.println("No. de puertas: " + puertas);
        System.out.println("No. de placa: " + noPlaca);
        System.out.println("Km/h: " + velocidad);
        System.out.println("Faros: " + X);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("\n");
    }
    public void acelera(){
        System.out.println("\n");
    }
    public void encendido(){
        System.out.println("\n");
    }
    public void apagado(){
        System.out.println("\n");
    }
    public void reversa(){
        System.out.println("\n");
    }
}