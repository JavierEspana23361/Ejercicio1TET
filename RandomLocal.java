import java.util.*;

public class RandomLocal {
    public void rlocalgen(){
        Random random = new Random();
        int local = random.nextInt(3);
        if(local == 0){
            //Local de $100
            //Aquí hay que llamar a un archivo csv que contenga la cantidad total de asientos disponibles por local.
            //Al archivo se le restarán los asientos disponibles conforme a las entradas que se compren cuando se ejecute el programa.
            if(true){ //aquí será si hay espacio disponible
                if(true){//Aquí hay que verificar si la cantidad de tickets solicitada es menor o igual al espacio disponible

                }
                else{
                    System.out.println("Lamentamos informar que no hay espacio disponible.");
                }
            }
            else{
                System.out.println("Lamentamos informar que no hay espacio disponible.");
            }
        }
        else if(local == 1){
            //Local de $500
            //Aquí lo mismo.
            if(true){ //aquí será si hay espacio disponible
                if(true){//Aquí hay que verificar si la cantidad de tickets solicitada es menor o igual al espacio disponible

                }
                else{
                    System.out.println("Lamentamos informar que no hay espacio disponible.");
                }
            }
            else{
                System.out.println("Lamentamos informar que no hay espacio disponible.");
            }
        }
        else if(local ==2){
            //Local de $1000
            //Aquí igual.
            if(true){ //aquí será si hay espacio disponible
                if(true){//Aquí hay que verificar si la cantidad de tickets solicitada es menor o igual al espacio disponible

                }
                else{
                    System.out.println("Lamentamos informar que no hay espacio disponible.");
                }
            }
            else{
                System.out.println("Lamentamos informar que no hay espacio disponible.");
            }
        }
    }
}
