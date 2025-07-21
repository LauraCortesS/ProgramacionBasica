public class Principal {
    
    public static void main(String[] args) {
        System.out.println("Creando objetos de las clases Carro y Gato\n");
        
        // CREACIÓN DE 3 OBJETOS CARRO 
        System.out.println("--- CREANDO CARROS ---");
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, "Rojo", 45.0, 0, false);
        Carro carro2 = new Carro("Honda", "Civic", 2019, "Azul", 30.0, 0, false);
        Carro carro3 = new Carro("Ford", "Focus", 2021, "Blanco", 10.0, 0, false);
        
        // CREACIÓN DE 3 OBJETOS GATO   
        System.out.println("\n--- CREANDO GATOS ---");
        Gato gato1 = new Gato("Pelusa", "Persa", 2, 4.2, "Blanco", 85, false);
        Gato gato2 = new Gato("Botas", "Siamés", 3, 3.8, "Gris", 90, true);
        Gato gato3 = new Gato("Maya", "Maine Coon", 4, 6.5, "Naranja", 70, false);
        
        System.out.println("\nDEMOSTRANDO FUNCIONALIDADES DE LOS CARROS");
        
        // CARRO 1
        System.out.println("\n--- PROBANDO " + carro1.obtenerInfo() + " ---");
        carro1.revisarEstado();
        carro1.encender("¡Vamos a manejar!");
        carro1.acelerar(25);
        carro1.acelerar();
        carro1.frenar();
        carro1.apagar();
        
        // CARRO 2
        System.out.println("\n--- PROBANDO " + carro2.obtenerInfo() + " ---");
        carro2.revisarEstado();
        carro2.encender();
        carro2.cargarCombustible(15);
        carro2.acelerar(40);
        carro2.revisarEstado();
        carro2.apagar();
        
        // CARRO 3
        System.out.println("\n--- PROBANDO " + carro3.obtenerInfo() + " ---");
        carro3.revisarEstado();  
        carro3.encender();  
        carro3.acelerar();
        carro3.cargarCombustible(20);  
        carro3.acelerar(15);  
        carro3.frenar();      
        
        System.out.println("\nDEMOSTRANDO FUNCIONALIDADES DE LOS GATOS");
        
        // GATO 1
        System.out.println("\n--- INTERACTUANDO CON " + gato1.nombre + " ---");
        gato1.revisarSalud();  
        gato1.maullar();        
        gato1.maullar(3);       
        gato1.ronronear();
        gato1.comer("Monello"); 
        gato1.dormir();
        
        // GATO 2
        System.out.println("\n--- INTERACTUANDO CON " + gato2.nombre + " ---");
        gato2.revisarSalud();  
        gato2.comer();         
        gato2.cazar();        
        gato2.jugar(); 
        gato2.maullar(2);       
        gato2.dormir();
        
        // GATO 3 
        System.out.println("\n--- INTERACTUANDO CON " + gato3.nombre + " ---");
        gato3.revisarSalud();   
        gato3.ronronear();
        gato3.comer("premium"); 
        gato3.jugar();      
        gato3.cazar();         
        gato3.maullar(4);        
        gato3.dormir();
    }
}
