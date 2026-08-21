class Kadence {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        
        // int len = nums.length;
        // System.out.println(len);
        // int sum =0;
        // for(int i=0 ; i< len;i++){
            
            if(sum<0){
                sum = 0;
            }
            sum = sum + nums[i];
            maxi = Math.max(maxi,sum);
            for(int j=i ;j<nums.length; j++){
                sum = sum + nums[j];
                if(sum>maxi){
                    maxi = sum;
                }


            
        }

        return maxi;
        
    }
}