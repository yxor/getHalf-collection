/**
 *
 * Find half of a value
 * 
 * Aaron Synod
 *
 */

public class findHalfOfVal {
	public static void main(String args[]){
		
		long time = java.lang.System.currentTimeMillis();
		new findHalfOfVal(((int)(Math.random()*Integer.MAX_VALUE)));
		long timetaken = java.lang.System.currentTimeMillis() - time;
		System.out.println("took " + timetaken + " mills");
	}
	
	public int findHalf(int v){
		int half=0;
		if(v>0){
			for(int i=1;i<v;i+=2){
				half++;
			}
		}else{
			for(int i=-1; i>v;i-=2){
				half--;
			}
		}
		return half;
	}
	
	public findHalfOfVal(int val){
		int half=0;
		
		if(val>0){
			for(int i=0;i<val;i++){
				if(isEven(i)){
					half++;
				}
			}
		}else{
			for(int i=0;i>val;i--){
				if(isEven(i)){
					half--;
				}
			}
		}
		System.out.println("Half of "+val+" is "+half);
	}
	public boolean isEven(int v){
		if(v<0){
			v*=-1;
		}
		boolean even = true;
		for(int i = 0; i <= v; i++){
			even = !even;
		}
		return even;
	}
}