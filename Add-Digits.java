class Solution {
    public static int digitSum(int n){
        int sum = 0;
        while(n!=0){
        sum = sum+(n%10);
        n/=10;
        }
        return sum;
    }
    public int addDigits(int num) {
        while(num>=10){
         num = digitSum(num);
        }  
       return num;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        int n = sc.nextInt();
        System.out.println(sol.addDigits(n));
    }
}
