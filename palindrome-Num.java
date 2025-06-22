import java.util.*;
class Solution {
    public int reverse(int n){
        int rev=0;
        while(n>0){
          rev=(rev*10)+(n%10);
          n/=10;
        }
        return rev;
     }
    public boolean isPalindrome(int x){
        if(x==reverse(x)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        int n = sc.nextInt();
        System.out.print(s.isPalindrome(n));
    }
}