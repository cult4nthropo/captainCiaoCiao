package src;

public class ArrayExercise {

	public static void main(String[] args) {
		System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));//5
		System.out.println(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5})); //-1
		System.out.println(findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));//5
		System.out.println(findIt(new int[]{10}));
		System.out.println(findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));//10
		System.out.println(findIt(new int[]{5,4,3,2,5,4,3,2,10,10}));//1

	}
	
	public static int findIt(int[] integerArray) {
	    int odd = 0;
	    int appearance = 0;
	    for (int number : integerArray) {
	    	appearance = 0;
	      for (int i = 0; i < integerArray.length; i++) {
	        if (number == integerArray[i]) {
	          appearance++;
	        }
	      }
	      if (appearance % 2 == 1) {
	          return number;
	        }
	    }
	    System.out.println("no odd number in array");
	  	return odd;
	  }

}
