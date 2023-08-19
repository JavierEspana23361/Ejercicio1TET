public class CompValid {




    public void validar(){
        DataSafe dataSafe = new DataSafe();
        Sale sale = new Sale();
        RandomGC RandomGC = new RandomGC();
        RandomGC.rgenandcompare();
          
        if(RandomGC.Apto() == true){
            
            RandomLocal locales = new RandomLocal();
            int[] disponibilidad = locales.localgen(dataSafe.getTickets());
    
            if(disponibilidad[0] > 0){ //aquí será si hay espacio disponible
                if(disponibilidad[0] < dataSafe.getTickets()){//Aquí hay que verificar si la cantidad de tickets solicitada es menor o igual al espacio disponible
                    System.out.println("Lamentamos informar que no hay espacio disponible.");
                    System.out.println("Se le venderan "+disponibilidad[0]+"tickets");
                }
                else if(disponibilidad[0] >= dataSafe.getTickets()){
                    System.out.println("Si hay espacio disponible!");
                    if(disponibilidad[1] > dataSafe.getPmax()){
                        System.out.println("Lamentamos informarle que el ticket es de mayor precio que su presupuesto");
                    }else{
                        dataSafe.setTotalM(disponibilidad[1]);
                        sale.EndSale();
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


    public void validarF(){
        Sale sale = new Sale();
        DataSafe dataSafe = new DataSafe();
        RandomLocal locales = new RandomLocal();
        int[] disponibilidadF = locales.fibonaccilocal();
    
        if(disponibilidadF[0] > 0){ //aquí será si hay espacio disponible
            if(disponibilidadF[0] < 1){//Aquí hay que verificar si la cantidad de tickets solicitada es menor o igual al espacio disponible
                System.out.println("Lamentamos informar que no hay espacio disponible.");
                System.out.println("Se le venderan "+disponibilidadF[0]+"tickets");
            }
            else if(disponibilidadF[0] >= 1){
                System.out.println("Si hay espacio disponible!");
                if(disponibilidadF[1] > dataSafe.getPmax()){
                    System.out.println("Lamentamos informarle que el ticket es de mayor precio que su presupuesto");
                }else{
                    dataSafe.setTotalM(disponibilidadF[1]); 
                    sale.EndSale();
                }
            }
        }
        else{
            System.out.println("Lamentamos informar que no hay espacio disponible.");
        }

        
        
    }


}

