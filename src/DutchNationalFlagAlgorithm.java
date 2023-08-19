public class DutchNationalFlagAlgorithm {
	
	public static void algorithm(int [] arr) {
		int low =0, mid =0, high=arr.length-1;
		while(mid<=high) {
			
			if(arr[mid]==1) {
				mid++;
			}
			else if(arr[mid]<1) {
				swap(mid,low,arr);
				low++;
				mid++;
			}
			else {
				swap(mid, high, arr);
				high--;
			}
		}
		for(int value: arr) {
			System.out.print(value+" ");
		}
		
	}
	
	public static void swap(int a, int b, int [] arr) {
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	public static void main(String [] args) {
		int [] arr = {2, 0, 1, 2, 1, 0, 2, 1};
		algorithm(arr);
	}

}
