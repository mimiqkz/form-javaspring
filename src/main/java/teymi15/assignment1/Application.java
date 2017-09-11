package teymi15.assignment1;
/**
* The program allows user the to write in their name in the input 
* and it will displayed their name with the greeting "Good Morning" + their name
* @author  Nu Phan Quynh Do
* @version 1.0
* @since   2017-09-5 
*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/**
* The main class extends the Spring Boot Servlet requires to run the project
* for the URL given by the client.
*/
@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	
	/**
	* This is the protected funcion which configurate the Spring Application
	* @param applicationBuilder
	*/
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
		return applicationBuilder.sources(Application.class);
	}
	
	/**
	* This is the main method which makes use of the Spring Application
	* @param args
	* @return Nothing
	*/
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
