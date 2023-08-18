import java.util.*;

public class DatosI {

    public static ArrayList<String> datosw() {
        ArrayList<String> addingdata = new ArrayList<>();
        addingdata.add(word);

        
        return addingdata;
    }

    public void datosI() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Para iniciar el proceso de compra de tickets debe introducir los siguientes datos: ");
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su email: ");
        String email = scanner.nextLine();
        System.out.println("Ingrese la cantidad de tickets que desea comprar (mínimo 1 ticket, máximo 6): ");
        int ctickets = scanner.nextInt();
        if(ctickets < 1 || ctickets > 6){
            System.out.println("Esa no es una cantidad válida de tickets, ingrese una cantidad permitida (mínimo 1 ticket, máximo 6): ");
            ctickets = scanner.nextInt();
        }
        System.out.println("Ingrese su presupuesto máximo en dólares: ");
        int pmax = scanner.nextInt();
    }

    
}