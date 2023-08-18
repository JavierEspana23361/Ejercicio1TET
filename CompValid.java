public class CompValid {
    public void validar(){
        RandomGC RandomGC = new RandomGC();
        RandomGC.rgenandcompare();
        RandomLocal RandomLocal = new RandomLocal();   
        if(RandomGC.Apto() == true){
            RandomLocal.rlocalgen();
        }
        else{
            System.out.println("El sistema ha rechazado su compra.");
        }
    }
}
