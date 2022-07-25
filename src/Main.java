public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.nombre = "Antonio Rosa Guerrero";
        cliente.edad = 27;
        cliente.numeroTelef = 666666666;
        cliente.credito = 2250000;
        System.out.println("Cliente: "+cliente.nombre);
        System.out.println("credito: "+cliente.credito + "€"+", "+"edad: "+ cliente.edad+", "+"Numero de Telefono: "+ cliente.numeroTelef);
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 28;
        trabajador.nombre = "Eloy Guzman";
        trabajador.numeroTelef = 654321987;
        trabajador.Salario = 2500;
        System.out.println("Trabajador: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad +", " +"Numero de Telefono: "+ trabajador.numeroTelef +", " + "Salario: "+ trabajador.Salario+ "€" );

    }
}
class Persona {
    public int edad;
    public String nombre;
    public int numeroTelef;

}
class Cliente extends Persona{
    int credito;
}
class Trabajador extends Persona{
     int Salario;
}