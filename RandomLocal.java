import java.util.*;

public class RandomLocal {
    Random random = new Random();
    private int voletos1 = 20;
    private int voletos2 = 20;
    private int voletos3 = 20;

    public int localgen(int tickets){
        int local = random.nextInt(3);
        if(local == 0){
            int voletosR = voletos1;
            voletos1 = voletos1 - tickets;
            return voletosR;
            
        }
        else if(local == 1){
            int voletosR = voletos2;
            voletos2 = voletos2 - tickets;
            return voletosR;
        }
        else if(local ==2){
           int voletosR = voletos3;
           voletos3 = voletos3 - tickets;
           return voletosR;
        }else{
            return local;
        }
        
    }
}
