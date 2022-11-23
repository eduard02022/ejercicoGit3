public class Empleado {
    String nombre;
    int edad;

    Empleado(String name, int edad) {
        nombre = name;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "El empleado " + nombre + " tiene" + edad + "años";
    }

}
}
