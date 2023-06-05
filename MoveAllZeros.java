package in.ineuron.util;


public class MoveAllZeros {
	  public static void main(String[] args) {
	    int arr[] ={ 1,2,0,1,0,4,0};
	    zerosToEnd(arr);

	  }
	  public static void zerosToEnd(int[] arr) {

	    //finding first zero occurrence
	    int k = 0;
	    while (k < arr.length) {
	      if (arr[k] == 0) {

	        break;
	      } else {
	        k = k + 1;
	      }
	    }

	    //finding zeros and immediate non-zero elements and swapping them
	    int i = k, j = k + 1;

	    while (i < arr.length && j < arr.length) {
	      if (arr[j] != 0) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	        i++;

	      }

	      j++;

	    }
	    for (i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " ");
	    }
	  }
	}