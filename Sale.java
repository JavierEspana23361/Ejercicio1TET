public class Sale {
    public void EndSale(){
        DataSafe dataSafe = new DataSafe();

        System.out.print("******************************************"+"\n");
        System.out.print("Gracias "+dataSafe.getnombre()+" por su compra!"+"\n");

        System.out.print("Se compraron: "+dataSafe.getTickets()+" Tickets"+"\n");
        System.out.print("Su total es de: $."+dataSafe.getTotalM()+"\n");

        System.out.println("Se le enviara un correo de confirmacion a: "+dataSafe.getemail()+"\n");
    }
}
