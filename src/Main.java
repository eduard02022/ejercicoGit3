public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Empleado p = new Empleado("Pepe Pérez", 30);
        System.out.println(p);

        p.nombre = "Otro nombre";
        System.out.println(p);
    }
}