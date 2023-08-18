import java.util.*;

public class RandomLocal {
    Random random = new Random();
    private int voletos1 = 20;
    private int voletos2 = 20;
    private int voletos3 = 20;

    public int[] localgen(int tickets){
        int local = random.nextInt(3);
        if(local == 0){
            int[] localv = new int[2];
            localv[1] = 100*tickets;
            if(tickets > voletos1){
                localv[1] = 100*voletos1;
            }
            localv[0] = voletos1;
            voletos1 = voletos1 - tickets;
            return localv;
            
        }
        else if(local == 1){
            int[] localv = new int[2];
            localv[1] = 500*tickets;
            if(tickets > voletos2){
                localv[1] = 100*voletos2;
            }
            localv[0] = voletos2;
            voletos2 = voletos2 - tickets;
            return localv;
        }
        else if(local ==2){
            int[] localv = new int[2];
            localv[1] = 1000*tickets;
            if(tickets > voletos3){
                localv[1] = 100*voletos3;
            }
            localv[0] = voletos3;
            voletos3 = voletos3 - tickets;
            return localv;
        }else{
            int[] localv = new int[2];
            localv[1] = 404;
            localv[0] = 404;
            return localv;
        }
        
    }
}
