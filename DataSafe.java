public class DataSafe {
    
    private static int ctickets;
    private static int pmax;
    private static int totalM;
    private static String nombre;
    private static String email;
    
    public void setCtickets(int tickets){ 
        ctickets = tickets;
    }

    public void setPmax(int max){
        pmax = max;
    }

    public void setNombre(String nnombre){ 
        nombre = nnombre;
    }

    public void setEmail(String eemail){  
        email = eemail;
    }

    public void setTotalM(int total){  
        totalM = total;
    }

    public String getnombre(){
        return nombre;
    }

    public String getemail(){
        return email;
    }

    public int getTickets(){
        return ctickets;
    }

    public int getPmax(){
        return pmax;
    }

    public int getTotalM(){
        return totalM;
    }


}
