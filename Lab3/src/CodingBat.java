public class CodingBat {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if((aSmile && bSmile) || (!aSmile && !bSmile)) return true;
        return false;
    }
    public int sumDouble(int a, int b) {
        if(a!=b){
            return a+b;
        }
        else{
            return 2*(a+b);
        }
    }
    public boolean frontAgain(String str) {
        if (str.length()<2)return false;
        char first= str.charAt(0);
        char second=str.charAt(1);
        if((str.charAt(str.length()-1) ==first && str.charAt(str.length()-2)==second) || (str.charAt(str.length()-2) ==first &&str.charAt(str.length()-1)==second)) return true;
        return false;
    }

    public int[] zeroFront(int[] nums) {
        int[] newnums = new int[nums.length];
        int zeros=0;

        for(int i=0; i<nums.length;i++){
            if(nums[i]==0) zeros++;
        }
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0) newnums[i]=0;

        }
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=0){ newnums[zeros]=nums[i];
                zeros++;}
        }
        return newnums;
    }
}
