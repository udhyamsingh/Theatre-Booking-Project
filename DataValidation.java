import java.util.function.*;

class DataValidation 
{
	

	public  void validateName(String name)
		{
		if (name.matches("[a-zA-Z]+")) {
            System.out.println("Valid string: " + name);
        } else {
            System.out.println("Invalid input! Please enter a string containing only alphabetic characters.");
        }

	  }
	 // public void validatePhone()
		//{
			public static boolean isValidPhoneNumber(String phone)
			{
				
					if ( phone.matches("[0-9]+"))
					{
						System.out.println("Phone is valid"+phone);
						return true;
					}
					else
					{
						System.out.println("Invalid Phone Number Try Different");
						return false;
					}
					//return false;
				}
				
			
	 public void validateEmail(String email)
		{
		if (email.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"))
		{
			System.out.println("Valid Email");
		}
		else
			{
				System.out.println("Invalid Email Please Enter Valid Email");
			}
		}
	public int generateOTP()
		{
		IntSupplier s=()->(int)(Math.random()*10);	
		String otp="";
		for (int i=0;i<6;i++)
		{
			otp=otp+s.getAsInt();
			
		}
        System.out.println(otp);
		return Integer.parseInt(otp);
	}
     public static void main(String[] args) throws Exception
	{
      DataValidation d=new DataValidation();
	 // d.validateName(name);
	 // d.isValidPhoneNumber(phone);
	 // d.validateEmail(email);
	  //d.generateOTP();
    }
}

