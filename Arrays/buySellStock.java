class buySellStock {
    public static int maxProfit(int[] prices) {
     int min = Integer.MAX_VALUE;
     int maxPro = 0;

     for(int i=0; i<prices.length; i++){
        min = Math.min(min, prices[i]);
        maxPro = Math.max(maxPro, prices[i] - min);
     }  
     return maxPro; 
    }

    public static void main (String args[]){
      int prices[] = {7, 1, 3, 6, 5};
     System.out.println( maxProfit(prices));
    }
}
