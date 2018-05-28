package StringCompare;

class Driver
{
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		IString idata=new IString("Amogh");
		IString sdata=new IString("Amogh");
		idata.firstret=idata.accept();
		sdata.secret=sdata.accept();
	//	System.out.println("first "+idata.firstret + " second "+sdata.secret);
		
		System.out.println(idata.equals(sdata));
	}

}
