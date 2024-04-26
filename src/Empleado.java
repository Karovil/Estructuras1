public class Empleado {
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Cargo;
    private int Edad;

    public Empleado(String nombre, String apellido, String direccion, String cargo, int edad){
        Nombre=nombre;
        Apellido=apellido;
        Direccion=direccion;
        Cargo=cargo;
        Edad=edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }
}

