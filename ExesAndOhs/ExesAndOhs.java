package algorithm_solutions.CodeWars.ExesAndOhs;

public class ExesAndOhs {

	public static void main(String[] args) {
		System.out.println(getXO("ooxx"));
		System.out.println(getXO("xooxx"));
		System.out.println(getXO("ooxXm"));
		System.out.println(getXO("zpzpzpp"));
		System.out.println(getXO("zzoo"));
	}
	
	public static boolean getXO (String str) {
	    
	    boolean result = false;
	    int x = 0;
	    int o = 0;
	    String[] letters = str.split("");
	    for(String l:letters) {
	    	if(l.equalsIgnoreCase("x")) {x++;}
	    	if(l.equalsIgnoreCase("o")) {o++;}
	    }
	    if(x==o)result = true;    
	    return result;	    
	  }

}
