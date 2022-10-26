public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Clase Cliente");
        System.out.println("-------------------------------------------------------------------------------");
        Cliente cliente = new Cliente();
        cliente.setCredito("1000.00");
        cliente.setEdad(25);
        cliente.setNombre("Armando");
        cliente.setTelefono(90912324);
        System.out.println("Su nombre es: " + cliente.getNombre() +
                            "\ntiene: " + cliente.getEdad() + " años" +
                            "\nSu telefono es: " + cliente.getTelefono() +
                            "\ny tiene " + cliente.getCredito() + " Creditos");

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Clase Trabajador");
        System.out.println("-------------------------------------------------------------------------------");
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Armando");
        trabajador.setEdad(25);
        trabajador.setTelefono(9099876);
        trabajador.setSalario(1700);

        System.out.println("Su nombre es: " + trabajador.getNombre()+
                            "\nTiene: " + trabajador.getEdad() + " años"+
                            "\nSu telefono es: " + trabajador.getTelefono() +
                            "\nSu salario es: " + trabajador.getSalario() + " Dolares"
        );
    }
}

class Persona{
    private String nombre;
    private int edad;
    private long telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    private String credito;

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
}

class Trabajador extends  Persona{
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}