

public class mergeSortExample {

	public static void main(String[] args){
		int[] arr={2,1,3,1,2};
		count(arr);

	}
	static void count(int[] arr){
		Long count=new  Long(0);
		mergeSortExample ex=new mergeSortExample();
		ex.mergeSort(arr,new int[arr.length], 0, arr.length-1,count);	
		
		System.out.println(count);
	}
	
	public void mergeSort(int arr[],int[] temp,int start,int rightEnd,Long count){	
		int left=start;
		int mid=(start+rightEnd)/2;
		int right=mid+1;
		while(start>=rightEnd){
			return;
		}
			mergeSort(arr,temp, left, mid, count);
			mergeSort(arr,temp, right, rightEnd,count);
			count=merge(arr,temp,left,rightEnd,count);
		
	}

	private Long merge(int[] arr,int[] temp, int leftStart, int rightEnd,Long count) {

		int mid=(leftStart+rightEnd)/2;
		int leftEnd=mid;
		int rightStart=mid+1;
		//three index each for left and right and one for temp;
		int leftIndex=leftStart;
		int rightIndex=rightStart;
		int index=leftStart;
		while(leftIndex<=leftEnd && rightIndex<=rightEnd){//traverse until one of the left or right indexed overflows 
			if(arr[leftIndex]<arr[rightIndex]){
				temp[index]=arr[leftIndex];
				leftIndex++;
			}else{
				temp[index]=arr[rightIndex];
				rightIndex++;
			}
			index++;
			count++;
		}
		System.arraycopy(arr, leftIndex, temp,index, leftEnd-leftIndex+1);//copy the remaining left 
		System.arraycopy(arr,rightIndex,temp,index,rightEnd-rightIndex+1);//copy the remaining right
		System.arraycopy(temp, leftStart, arr, leftStart, rightEnd-leftStart+1);
		return count;
	}
}
