package FirstWeek;

public class Binarysearch {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int k = 10;
		int l=0;
		int h= arr.length-1;
	     boolean found = false;
	     
		while(l<=h) {
			
			int m=l+h/2;
			
			if(arr[m]==k) {
				System.out.print("element "+k+" is there in the array");
			found = true;
				break;
			}
			if(arr[m]<k) {
				l=m+1;
			}else {
				h=m-1;
			}
			
			
		}
		
		if(!found) {
			System.out.println("element "+k+" is not there in the array");
		}
		
	}

}

