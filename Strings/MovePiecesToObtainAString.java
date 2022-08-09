package Strings;

public class MovePiecesToObtainAString {
    public static boolean canChange(String start, String target) {
        int n = start.length();
        int m = target.length();
        int s_idx_l=0,t_idx_l=0;
        int s_idx_r=0,t_idx_r=0;
        for(int i=0;i<n;i++){
            if(start.charAt(i)=='L'){
                s_idx_l=i;
            }
            if(target.charAt(i)=='L'){
                t_idx_l=i;
            }
        }
        
        for(int i=0;i<n;i++){
            if(start.charAt(i)=='R'){
                s_idx_r=i;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(target.charAt(i)=='R'){
                t_idx_r=i;
                break;
            }
        }
        if(s_idx_l<t_idx_l){
            return false;
        }
        if(s_idx_r>t_idx_r){
            return false;
        }
        
        String s=start.replace("_","");
        String t=target.replace("_","");
        if(s.equals(t)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String a="_L__R__R_";
        String b="L______RR";
        System.out.println(canChange(a,b));
    }
}
