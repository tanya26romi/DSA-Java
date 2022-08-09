package DesignProblems;

/**
 * Design_an_ATM_Machine
 */

 
public class Design_an_ATM_Machine {

    int n;
    int[] notes;
    int[] notes_count;
    boolean flag=true;
    public Design_an_ATM_Machine() {
        n=5;
        notes = new int[n];
        notes[0]=20;
        notes[1]=50;
        notes[2]=100;
        notes[3]=200;
        notes[4]=500;
        notes_count = new int[n];
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i=0;i<n;i++){
            notes_count[i]+=banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        flag=true;
        int[] res = new int[n];
        solve(notes, notes_count, n-1, n, amount, res);
        System.out.print("flag = "+flag+" and res = ");
        for(int i=0;i<5;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        System.out.print("LeftOver = ");
        for(int i=0;i<5;i++){
            System.out.print(notes_count[i]+" ");
        }
        if(flag == false){
            //add back into note count
            for(int i=0;i<n;i++)
            {
                notes_count[i]+=res[i];
            }
            int[] arr = new int[1];
            arr[0]=-1;
            return arr;
        }
        else
            return res;
    }
    
    public void solve(int[] notes, int[] notes_count, int s, int n, int amount, int[] res){
        if(s==0){
            if(amount!=0){
                flag=false;
                return;
            }
            return;
        }
        //notes     20  50  100 200 500
        //Leftover   0   0   0   2   0
        // New add   0   1   0   3   1
        //amount    600
        if(amount==0)
            return;
        //taking the note
        if(notes[s]<=amount && notes_count[s]>=1){
            notes_count[s]-=1;
            res[s]+=1;
            solve(notes,notes_count, s, n, amount-notes[s], res);
        }
        else{
            solve(notes, notes_count, s-1, n, amount, res);
        }
        
    }
    public static void main(String[] args) {
        Design_an_ATM_Machine design = new Design_an_ATM_Machine();
        int[] ans;
        int[] banknotesCount = new int[5];
        banknotesCount[0]=0;banknotesCount[1]=0;banknotesCount[2]=1;banknotesCount[3]=2;banknotesCount[4]=1;
        design.deposit(banknotesCount);
        
        ans = design.withdraw(600);
        System.out.print("ans = ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        banknotesCount[0]=0;banknotesCount[1]=1;banknotesCount[2]=0;banknotesCount[3]=1;banknotesCount[4]=1;
        //notes     20  50  100 200 500
        //Leftover   0   0   0   2   0
        // New add   0   1   0   3   1
        design.deposit(banknotesCount);
        ans = design.withdraw(600);
        System.out.print("ans = ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        ans = design.withdraw(550);
        System.out.print("ans = ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}