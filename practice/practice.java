public class practice{
public static int perplex(int x,int y){
	x+=3;
	y+=x;
	if(y>x+2){ return x; }
	return x+y;
}

public static void main( String args[] ){
	int x=-4,z=7;
	int y=perplex(z,x);
	System.out.println(y+" "+x);		//(a)
	x=10;
	y=perplex(x,x);
	System.out.println(y+ " " + x);	//(b)
     System.out.println( perplex(5, 1+perplex(6,7)));	//(c)
} 
   }