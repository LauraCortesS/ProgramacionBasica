public class Carro {
    String marca;
    String modelo;
    int año;
    String color;
    double combustible;
    int velocidad;
    boolean encendido;
    
    // Constructor
    public Carro(String marca, String modelo, int año, String color, double combustible, int velocidad, boolean encendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.combustible = combustible;
        this.velocidad = velocidad;
        this.encendido = encendido;
    }
    
    // Método 1: encender
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El " + marca + " " + modelo + " se ha encendido");
        } else {
            System.out.println("El carro ya está encendido");
        }
    }
    
    // Sobrecarga de encender
    public void encender(String mensaje) {
        if (!encendido) {
            encendido = true;
            System.out.println(mensaje + " - El " + marca + " " + modelo + " se ha encendido");
        } else {
            System.out.println("El carro ya está encendido");
        }
    }
    
    // Método 2: acelerar
    public void acelerar() {
        if (encendido && combustible > 0) {
            velocidad += 10;
            combustible -= 0.5;
            System.out.println("Acelerando... Velocidad actual: " + velocidad + " km/h");
        } else {
            System.out.println("No se puede acelerar. Revisa si está encendido y tiene combustible");
        }
    }
    
    // Sobrecarga de acelerar
    public void acelerar(int incremento) {
        if (encendido && combustible > 0) {
            velocidad += incremento;
            combustible -= (incremento * 0.1);
            System.out.println("Acelerando... Velocidad actual: " + velocidad + " km/h");
        } else {
            System.out.println("No se puede acelerar. Revisa si está encendido y tiene combustible");
        }
    }
    
    // Método 3: frenar
    public void frenar() {
        System.out.println("Frenando el " + marca + " " + modelo + "...");
        while (velocidad > 0) {
            velocidad -= 5;
            if (velocidad < 0) {
                velocidad = 0;
            }
            System.out.println("Velocidad: " + velocidad + " km/h");
        }
        System.out.println("El carro se ha detenido completamente");
    }
    
    // Método 4: cargarCombustible
    public void cargarCombustible(double litros) {
        System.out.println("Cargando combustible...");
        for (int i = 1; i <= litros; i++) {
            combustible += 1;
            System.out.println("Litro " + i + " cargado. Total: " + combustible + " litros");
        }
        System.out.println("Carga de combustible completada");
    }
    
    // Método 5: revisar estado
    public void revisarEstado() {
        System.out.println("*** Estado del " + marca + " " + modelo + " ***");
        System.out.println("Año: " + año);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Combustible: " + combustible + " litros");
        
        if (encendido) {
            System.out.println("Estado: Encendido");
        } else {
            System.out.println("Estado: Apagado");
        }
        
        if (combustible < 5) {
            System.out.println("¡ADVERTENCIA: Combustible bajo!");
        } else if (combustible < 15) {
            System.out.println("Combustible en nivel medio");
        } else {
            System.out.println("Combustible en buen nivel");
        }
    }
    
    // Método 6: apagar
    public void apagar() {
        if (encendido) {
            encendido = false;
            velocidad = 0;
            System.out.println("El " + marca + " " + modelo + " se ha apagado");
        } else {
            System.out.println("El carro ya está apagado");
        }
    }
    
    // Método 7: obtener información
    public String obtenerInfo() {
        return marca + " " + modelo + " (" + año + ") - Color: " + color;
    }
}
