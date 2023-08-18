public class CompValid {
    public void validar(){
        RandomGC RandomGC = new RandomGC();
        RandomGC.rgenandcompare();
          
        if(RandomGC.Apto() == true){
            DatosI data = new DatosI();
            RandomLocal locales = new RandomLocal();
            int[] disponibilidad = locales.localgen(data.getTickets());
    
            if(disponibilidad[0] > 0){ //aquí será si hay espacio disponible
                if(disponibilidad[0] < data.getTickets()){//Aquí hay que verificar si la cantidad de tickets solicitada es menor o igual al espacio disponible
                    System.out.println("Lamentamos informar que no hay espacio disponible.");
                    System.out.println("Se le venderan "+disponibilidad[0]+"tickets");
                }
                else if(disponibilidad[0] >= data.getTickets()){
                    System.out.println("Si hay espacio disponible!");
                    if(disponibilidad[1] > data.getPmax()){
                        System.out.println("Lamentamos informarle que el ticket es de mayor precio que su presupuesto");
                    }else{
                        //idk what you want to put here
                    }
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
