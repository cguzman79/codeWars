package algorithm_solutions.CodeWars.BuyingACar;

public class buyingACar {

	public static void main(String[] args) {
		
		int[] solution = BuyCar.nbMonths(2000,8000,1000,1.5);		
		//outputs
		System.out.println("("+solution[0]+", "+solution[1]+")");
	}//end main().
	
	public static class BuyCar {

		public static int[] nbMonths(int startPriceOld, int startPriceNew, 
				int savingperMonth, double percentLossByMonth) {
	    	int[] result = new int[] {0,(int)(startPriceOld-startPriceNew)};
	    	double priceOld = startPriceOld;
	    	double priceNew = startPriceNew;
	    	double percentLoss = percentLossByMonth/100;
	    	double diff = (priceOld-priceNew);
	    	result[1] = (int) diff;
	    	double savings = savingperMonth;
	    	
	    	/*if the value of the old car is higher>=the value of the new car*/
	    	if(result[1]>=0) return result;	    	
	    	
	    	while(result[1]<0) {
	    		result[0]++;
	    	//every two months the percentage of loss increases by 0.5%.
	    	if((result[0]%2==0)&&(result[0]>1)) {percentLoss+=0.005;}	    	
	    	//adjusting value based on percentLoss.
			priceOld-=(percentLoss*priceOld);				
			priceNew-=(percentLoss*priceNew);	    		
	    	diff = priceOld-priceNew;	    		
	    	result[1]=(int) (diff+savings);	    	
	    	savings+=1000;	    					
	    	}//end while.	    	
			return result;
		}
	}
	
	/*CodeWars Solution
	 int month = 1;
    int savings = 0;
    double startPriceOldD = (double) startPriceOld;
    double startPriceNewD = (double) startPriceNew;
    while (startPriceNewD > (startPriceOldD + savings)) {
      if (month % 2 == 0) percentLossByMonth += .5d;
      startPriceOldD *= (1 - percentLossByMonth / 100);
      startPriceNewD *= (1 - percentLossByMonth / 100);
      savings += savingperMonth;
      month++;
    }
    return new int[] { --month, (int) Math.round((startPriceOldD + savings) - startPriceNewD) }; 
	 */

}

