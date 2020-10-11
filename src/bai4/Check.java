package bai4;

public class Check {

	
	
	public static boolean checkFullName(String s) throws Exception
    {
        try
        {
           
            if(s.matches("[a-z A-Z]{0,15}"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
	 public static boolean checkID(String s) throws Exception
	    {
	        try
	        {
	          
	            if(s.matches("^(HL)(\\w{0,4})$"))
	            {
	                return true;
	            }
	            else
	            {
	                return false;
	            }
	        }
	        catch(Exception ex)
	        {
	            throw ex;
	        }
	    }
	 public static boolean checkDate(String s)
	 {
		 if(s.matches("\\\\d{2}[-|/]\\\\d{2}[-|/]\\\\d{4}"))
		 {
			 return true;
		 }
		return false;
	 }
	 public static boolean checkRage(String s)
	 {
		return false;
		 
	 }
	
}
