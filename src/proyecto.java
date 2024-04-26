import java.util.LinkedList;
import java.util.Scanner;

public class proyecto {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        Scanner sc = new Scanner(System.in);
        LinkedList<Empleado> empleados = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            Empleado item = new Empleado(null,null,null,null,0);
            System.out.println("Ingrese el nombre");
            item.setNombre(sc.next());
            System.out.println("Ingrese el apellido");
            item.setApellido(sc.next());
            System.out.println("Ingrese la direccion");
            item.setDireccion(sc.next());
            System.out.println("Ingrese el cargo");
            item.setCargo(sc.next());
            System.out.println("Ingrese la edad");
            item.setEdad(Integer.parseInt(sc.next()));
            empleados.add(item);
        }
        String cadena = "";
        for (Empleado empleado:empleados) {
            cadena=cadena+empleado.getNombre()+" "
                    +empleado.getApellido()+" "
                    +empleado.getDireccion()+" "
                    +empleado.getCargo()+" "
                    +empleado.getEdad();
        }
        System.out.println(cadena);

    }

}
