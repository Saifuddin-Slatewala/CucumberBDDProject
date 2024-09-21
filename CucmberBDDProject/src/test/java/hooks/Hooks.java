package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	// Tags in Runner Class and Tagged Hooks don't go together
		//Using tagged hooks for Login
		//Use BeforeStep hooks to run for before every test step
		// Use tags inside hooks option to run hooks for particular scenarios
		@Before()
		public void open() {
			System.out.println("Browser got Open");
		}
		
		// Tags in Runner Class and Tagged Hooks don't go together
		//Using tagged hooks for Login
		//Use AfterStep hooks to run for after every test step
		// Use tags inside hooks option to run hooks for particular scenarios
		@After()
		public void close() {
			System.out.println("Browser got Closed");
		}
}
