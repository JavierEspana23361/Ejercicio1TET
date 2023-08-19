import java.util.*;

public class DatosI {

    

    //String pm = Integer.toString(pmax);
    public void datosw(){
        DataSafe dataSafe = new DataSafe();
        FibonacciValidation FibonacciValidation = new FibonacciValidation();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Para iniciar el proceso de compra de tickets debe introducir los siguientes datos: ");
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        dataSafe.setNombre(nombre);
        
        System.out.println("Ingrese su email: ");
        String email = scanner.nextLine();
        dataSafe.setEmail(email);

        System.out.println("Ingrese la cantidad de tickets que desea comprar (mínimo 1 ticket, máximo 6): ");
        int ctickets = scanner.nextInt();

        if(ctickets < 1 || ctickets > 6){
            System.out.println("Esa no es una cantidad válida de tickets, ingrese una cantidad permitida (mínimo 1 ticket, máximo 6): ");
            ctickets = scanner.nextInt();
        }
        dataSafe.setCtickets(ctickets);

        System.out.println("Ingrese su presupuesto máximo en dólares: ");
        int pmax = scanner.nextInt();
        dataSafe.setPmax(pmax);

        
        String sino = scanner.nextLine();

        
        

        System.out.println("De poseer una ¿Desea ingresar una contraseña exclusiva? (y/n) ");
        String special = scanner.nextLine();
        if(special.equals("y")|| special.equals("Y")){
            FibonacciValidation.fvalidation();
        }
        
        System.out.println("************************");
        System.out.println("Procediendo a validar");
        System.out.println("************************");

        
    }
}

    