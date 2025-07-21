public class Gato {
    String nombre;
    String raza;
    int edad;
    double peso;
    String color;
    int energia;
    boolean hambriento;
    
    // Constructor
    public Gato(String nombre, String raza, int edad, double peso, String color, int energia, boolean hambriento) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
        this.energia = energia;
        this.hambriento = hambriento;
    }
    
    // Método 1: maullar
    public void maullar() {
        if (energia > 5) {
            energia -= 3;
            System.out.println(nombre + " está maullando: ¡Miau miau!");
        } else {
            System.out.println(nombre + " está muy cansado para maullar");
        }
    }
    
    // Sobrecarga de maullar
    public void maullar(int veces) {
        System.out.println(nombre + " va a maullar " + veces + " veces:");
        for (int i = 1; i <= veces; i++) {
            if (energia > 2) {
                energia -= 1;
                System.out.println("Maullido " + i + ": ¡Miau!");
            } else {
                System.out.println(nombre + " se quedó sin energía después de " + (i-1) + " maullidos");
                break;
            }
        }
    }
    
    // Método 2: comer
    public void comer() {
        if (hambriento) {
            hambriento = false;
            energia += 20;
            peso += 0.05;
            System.out.println(nombre + " ha comido y se siente satisfecho");
        } else {
            System.out.println(nombre + " no tiene hambre ahora");
        }
    }
    
    // Sobrecarga de comer
    public void comer(String tipoComida) {
        if (hambriento) {
            hambriento = false;
            if (tipoComida.equals("atún")) {
                energia += 30;
                peso += 0.03;
                System.out.println(nombre + " ha comido " + tipoComida + " y está muy feliz ¡ronronea!");
            } else if (tipoComida.equals("Whiskas")) {
                energia += 25;
                peso += 0.04;
                System.out.println(nombre + " ha comido comida " + tipoComida + " y está contento");
            } else {
                energia += 15;
                peso += 0.06;
                System.out.println(nombre + " ha comido " + tipoComida);
            }
        } else {
            System.out.println(nombre + " no tiene hambre para " + tipoComida);
        }
    }
    
    // Método 3: cazar
    public void cazar() {
        System.out.println(nombre + " comenzó a cazar...");
        int intentos = 0;
        boolean exitoso = false;
        
        while (energia > 15 && intentos < 5 && !exitoso) {
            energia -= 8;
            intentos++;
            System.out.println("Intento de caza " + intentos + "... Energía: " + energia);

            if (intentos >= 3) {
                exitoso = true;
                System.out.println("¡" + nombre + " cazó exitosamente después de " + intentos + " intentos!");
            }
        }
        
        if (!exitoso) {
            System.out.println(nombre + " no logró cazar después de " + intentos + " intentos");
        }
        
        hambriento = true;
    }
    
    // Método 4: jugar 
    public void jugar() {
        if (energia > 5) {
            energia -= 4;
            System.out.println(nombre + " se divierte jugando :D");
        } else {
            System.out.println(nombre + " no tiene suficiente energía para jugar");
        }
    }

    // Método 5: revisar salud
    public void revisarSalud() {
        System.out.println("*** Revisión de salud de " + nombre + " ***");
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Color: " + color);
        System.out.println("Energía: " + energia);
        
        if (hambriento) {
            System.out.println("Estado: Tiene hambre");
        } else {
            System.out.println("Estado: Satisfecho");
        }
        
        if (energia < 15) {
            System.out.println("¡ALERTA: Energía muy baja, necesita descansar!");
        } else if (energia < 40) {
            System.out.println("Energía moderada, puede hacer actividades ligeras");
        } else {
            System.out.println("Energía excelente, listo para jugar y cazar");
        }
        
        if (peso > 8) {
            System.out.println("Advertencia: Sobrepeso, necesita más actividad");
        } else if (peso < 2) {
            System.out.println("Advertencia: Bajo peso, necesita más alimentación");
        } else {
            System.out.println("Peso saludable para un gato");
        }
    }
    
    // Método 6: dormir
    public void dormir() {
        System.out.println(nombre + " está durmiendo... Zzz");
        energia += 35;
        if (energia > 100) {
            energia = 100;
        }
        System.out.println(nombre + " despertó renovado con " + energia + " de energía");
    }
    
    // Método 7: ronronear
    public void ronronear() {
        if (energia > 10 && !hambriento) {
            energia -= 2;
            System.out.println(nombre + " está ronroneando felizmente... rrr rrr rrr");
        } else if (hambriento) {
            System.out.println(nombre + " no puede ronronear porque tiene hambre");
        } else {
            System.out.println(nombre + " está muy cansado para ronronear");
        }
    }
}
