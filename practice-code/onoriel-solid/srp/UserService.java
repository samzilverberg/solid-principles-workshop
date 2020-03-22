package solid.srp;

public class UserService
{
	Database database;
	SmtpClient smtpClient;
	
	
     /**
     *  HINT:
     * The name Register suggests that the method should register the user in the system. 
     * Doing email validation doesn’t seem to belong in an register method.
     * 
     * If we continue to look at the method we’ll see that it also sends an email 
     * and is therefore also responsible of delivering the email.
     * 
     */
    public void Register(String email, String password) throws ValidationException
     {
          if (!email.contains("@"))
              throw new ValidationException("Email is not an email!");
 
         User user = new User(email, password);
         database.save(user);
 
         smtpClient.send(new MailMessage("mysite@nowhere.com", "Hello VASS!"));
     }
     
    
     
    
     class User{
    	 String email;
    	 String password;
    	 public User(String email, String password){
    		 this.email = email;
    		 this.password = password;
    	 }
     }
     class Database{
    	 public void save(User user){
    		 // Save user
    	 }
     }
     class SmtpClient{
    	 public void send(MailMessage mailMessage){
    		//Send mail 
    	 }
     }
     class MailMessage{
    	 String subject;
    	 String email;
    	 public MailMessage (String email, String subject){
    		 this.email = email;
    		 this.subject = subject;
    	 }
    	 
     }
     class ValidationException extends Exception {

    	  public ValidationException(String message){
    	     super(message);
    	  }

    }
}
