
public class practice {
	public static void main (String[] args){
	while (array[mid]!=key&&high<=low){
		iteration++;
		if (key<array[mid]){
			high=mid-1;
		}
		if (key>array[mid]){
			low=mid+1;
		}
		mid = (high+low)/2;
	}
	if (high>=low){
		found;
	}
	}
}