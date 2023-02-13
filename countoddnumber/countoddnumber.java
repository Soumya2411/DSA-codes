package countoddnumber;

public class countoddnumber {
    int range=high-low;
    if(low%2==1&&high%2==1){
        return (range/2)+1;
    }
    if(low%2==0&&high%2==0){
        return range/2;
        
    }
    else{
        else return (int)Math.ceil((double)range/2);
    }
}
