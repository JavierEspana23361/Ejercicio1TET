import java.util.*;

public class DatosI {

    private int ctickets;
    private int pmax;
    private String nombre;
    private String email;


    //String pm = Integer.toString(pmax);
    public void datosw(){

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para iniciar el proceso de compra de tickets debe introducir los siguientes datos: ");
        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese su email: ");
        email = scanner.nextLine();

        System.out.println("Ingrese la cantidad de tickets que desea comprar (mínimo 1 ticket, máximo 6): ");
        ctickets = scanner.nextInt();
        if(ctickets < 1 || ctickets > 6){
            System.out.println("Esa no es una cantidad válida de tickets, ingrese una cantidad permitida (mínimo 1 ticket, máximo 6): ");
            ctickets = scanner.nextInt();
        }

        System.out.println("Ingrese su presupuesto máximo en dólares: ");
        pmax = scanner.nextInt();
        
    }

    public String getnombre(){
        return nombre;
    }

    public String getemail(){
        return email;
    }

    public int getTickets(){
        return ctickets;
    }

    public int getPmax(){
        return pmax;
    }

}