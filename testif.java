
public class testif {

		int x;
		
public static void main (String[] args)
{
	testif tobj = new testif();
	tobj.x = 5;
	
	
	if (tobj.x > 0) System.out.println(tobj.x + " is a positive number");
	else if (tobj.x == 0) System.out.println(tobj.x +" is a postive nor negative");
	else System.out.println(tobj.x + " is a negative number");
	
	tobj.getNumber(10);
	tobj.getNumber(-2);
	tobj.getNumber(0);
	tobj.getNumber(tobj.x);
}
void getNumber(int i1) {
	if(i1 >0) System.out.println(i1 + " is a positive number");
	else if (i1 == 0) System.out.println(i1 + " is neither pos or neg");
	else System.out.println(i1 + " is a negative number");
}
}
