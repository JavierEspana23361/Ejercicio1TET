public class CompValid {
    public void validar(){
        RandomGC RandomGC = new RandomGC();
        RandomGC.rgenandcompare();
        RandomLocal RandomLocal = new RandomLocal();   
        if(RandomGC.Apto() == true){
            RandomLocal locales = new RandomLocal();
            int disponibilidad = locales.localgen();
    
            if(disponibilidad > 0){ //aquí será si hay espacio disponible
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
        else{
            System.out.println("El sistema ha rechazado su compra.");
        }
    }
}
