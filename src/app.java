// Namespace - keeping object unique.
// Translates to a folder
// Helps you organize 'like' code


// App is the entry point to the application
public class app {

	public static void main(String[] args)
	{
	User u1 = new User();
	u1.setFirstname("George");
	u1.setLastname("John");
	u1.setEmail("david2@protonmail.com");
	u1.setUsername("GeorgeJohn12345");
	// Call a service that returns hundreds of users....
	System.out.println(u1.getEmail());
	
	User u2 = new User();
	u2.setFirstname("George");
	u2.setLastname("John");
	u2.setEmail("david20345@protonmail.com");
	u2.setUsername("GeorgeJohn");
	
	System.out.println(u2.getEmail());
	
	User u3 = new User();
	u3.setFirstname("David");
	u3.setLastname("ManiCanana");
	u3.setEmail("25@protonmail.com");
	u3.setUsername("XXxDAvidxXX");
	System.out.println(u3.getEmail());
	
	User u4 = new User();
	u4.setFirstname("Sam");
	u4.setLastname("Blam");
	u4.setEmail("SDlamdaBam@protonmail.com");
	u4.setUsername("Sam57");
	System.out.println(u4.getEmail());
	
	User u5 = new User();
	u5.setFirstname("Vlad");
	u5.setLastname("Vlad");
	u5.setEmail("Vlad@protonmail.com");
	u5.setUsername("Vladican");
	System.out.println(u5.getEmail());
	
	User u6 = new User();
	u6.setFirstname("Quinten");
	u6.setLastname("Stien");
	u6.setEmail("dsfsdafad@protonmail.com");
	u6.setUsername("Quint97");
	System.out.println(u6.getEmail());
	
	User u7 = new User();
	u7.setFirstname("mikie");
	u7.setLastname("Vlada");
	u7.setEmail("qwerty@protonmail.com");
	u7.setUsername("Mikie234");
	System.out.println(u7.getEmail());
	
	User u8 = new User();
	u8.setFirstname("Vlad");
	u8.setLastname("Vlad");
	u8.setEmail("YYY@protonmail.com");
	u8.setUsername("YYY");
	System.out.println(u8.getEmail());
	
	User u9 = new User();
	u9.setFirstname("Vlad");
	u9.setLastname("Vlad");
	u9.setEmail("vafs203@protonmail.com");
	u9.setUsername("Vladican");
	System.out.println(u9.getEmail());
	
	User u10 = new User();
	u10.setFirstname("Vlad");
	u10.setLastname("Vlad");
	u10.setEmail("sadasn42154@protonmail.com");
	u10.setUsername("Vladican");
	System.out.println(u10.getEmail());
	// for loop
	for (int x = 0; x < 100; x++)
	{
		//Prompt user to guess letter
		//Prompt user with mask of word (recalculate mask based on user input)
		//Prompt user with hint
		//Collect user input
		//repeat...
		System.out.println(x);
		x = x + 5;
	} // Increment counter
	}
	
	
	
	
}
