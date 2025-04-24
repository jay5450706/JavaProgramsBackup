package anotherpackage;

//import mypackage.Rectangle;

public class Statistics<T extends Number> {
    T[] nums;

    //specify Rectangle as an upper bound and uncomment, it works!
    //double d =  nums[0].getHeight();

    //Pass the constructor a reference to an array of type T
    Statistics(T[] o){
        nums = o;
    }

    //Return type double in all cases.
    double average(){
        double sum = 0.0;
        for(int i = 0;i < nums.length; i++){
            //if T doesn't extend Number, then the method is undefined for type T error
            sum += nums[i].doubleValue(); 
        }
        return sum/nums.length;
    }

    boolean sameAvg(Statistics<?> ob){
		if(average() == ob.average()){
			return true;
		}
		return false;
	}

   

}
