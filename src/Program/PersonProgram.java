package Program;
import java.awt.event.ActionEvent;
import java.util.EventListener;

import Beans.Person;
import Beans.WakeupEventListener;;
public class PersonProgram{
	public static void main(String[] args) {
		Person person = new Person();
		WakeupEventListener listener = new WakeupEventListener();
		//String firstName = null;
		person.setFirstName("John");
		person.setLastName("Smith");
		person.setAge(55);
		person.setProfession("Retired");
		person.setActionListener(listener);
		//System.out.println(person);
		while(!person.wakeUp()) {
			System.out.println(String.format("Hey %s wakeup", person.getFirstName()));
		}
	}
}


