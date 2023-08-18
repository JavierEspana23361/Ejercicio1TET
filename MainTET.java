import java.util.ArrayList;
import java.util.Scanner;

public class MainTET {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        DatosI DatosI = new DatosI(); //En DatosI están se pide el nombre, el email, la cantidad de tickets y el presupuesto.
        CompValid CompValid = new CompValid(); //Aquí se valida si se puede proceder a la compra de los tickets o no.
        System.out.println("¡Bienvenido/a al sistema de compra de tickets para The Eras Tour: by Tylor Swift!");

        //Pedir datos
        System.out.println("Ingrese el path del archivo");
		String path = in.nextLine();
		ArrayList<String> datosguardar = DatosI.datosw();
				
		FilesManager.writeFiles(path, datosguardar);
				
		System.out.println("Guardado exitosamente");

        //Mando a llamar a FilesManager 
		ArrayList<String> todoslosDatos = FilesManager.readFiles(path);
        System.out.println(todoslosDatos);

        //CompValid.validar();
    }
}
