public class CompValid {
    public void validar(){
        RandomGC RandomGC = new RandomGC();
        RandomGC.rgenandcompare();

        if(RandomGC.Apto() == true){
            
        }
        else{
            System.out.println("El sistema ha rechazado su compra.");
        }
    }
}
