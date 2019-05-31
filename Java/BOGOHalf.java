/**
 * 
 * 
 * @author Aaron Synod
 *
 */


public class BOGOHalf {
	public static void main(String args[]){
		new BOGOHalf();
	}
	public BOGOHalf() {
		// TODO Auto-generated constructor stub
		int val = (int)(Math.random()*(Integer.MAX_VALUE));
		long timeStart = java.lang.System.currentTimeMillis();
		int half = findHalf(val);
		long timeStop = java.lang.System.currentTimeMillis();
		System.out.println("Half of "+val+" is "+half);
		System.out.println("It took "+ (timeStop-timeStart) + " Milliseconds to do the thing!");
	}
	private int findHalf(int val) {
		// TODO Auto-generated method stub
		int half = 0;
		boolean negitive = val<0;
		if(negitive){
			val*=-1;
		}
		
		boolean searching = true;
		if(val == 1 || val == 0){
			searching = false;
		}
		while(searching){
			half=(int)(Math.random()*Integer.MAX_VALUE);
			searching = !(half*2 == val || half*2 == val-1);
		}
		if(negitive){
			half*=-1;
		}
		return half;
	}
}
