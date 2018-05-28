package StringCompare;

public class IString {
	String firstret,secret;
	String data,redata="";
	int fwdloop,revloop;
	char oridata[],revdata[];
	public IString(String mydata)
		{
			data=mydata;
		}
		public String accept()
		{
			oridata=new char[20];
			revdata=new char[20];
			for(fwdloop=0;fwdloop<data.length();fwdloop++)
			{
				oridata[fwdloop]=data.charAt(fwdloop);
			}
			//reversing the data
			fwdloop=0;
			for(revloop=data.length()-1;revloop>=0;revloop--)
			{
				revdata[fwdloop]=oridata[revloop];
			fwdloop++;
			}
			for(fwdloop=0;fwdloop<data.length();fwdloop++)
			{
			redata=redata+revdata[fwdloop];
			}
			return redata;
		}
		
		int flag=0;
		
		@Override
		public boolean equals(Object o)
		{
			int len=redata.length();
			System.out.println("length ln="+len);

			for(int cnt =0 ;cnt < len ; cnt++)
			{
				System.out.println(this.redata.substring(cnt,cnt+1)+"  "+redata.substring(cnt,cnt+1));
				
				
				if(this.redata.substring(cnt,cnt+1)!=redata.substring(cnt,cnt+1))
				{
					flag=1;
				//	break;
					
				}
				
			}
			if(flag == 0)
			return true;
			else
				return false;
		}
}

