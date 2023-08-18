public class CompValid {
    public void validar(){
        RandomGC RandomGC = new RandomGC();
        RandomGC.rgenandcompare();
          
        if(RandomGC.Apto() == true){
            DatosI data = new DatosI();
            RandomLocal locales = new RandomLocal();
            int disponibilidad = locales.localgen(data.getTickets());
    
            if(disponibilidad > 0){ //aquí será si hay espacio disponible
                if(disponibilidad < data.getTickets()){//Aquí hay que verificar si la cantidad de tickets solicitada es menor o igual al espacio disponible
                    System.out.println("usted es un pendejo y no sabe leer que no se pueden mas de 6 tickets.");
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
