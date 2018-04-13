package Beans;

import java.awt.event.ActionEvent;
import java.util.EventListener;

public class WakeupEventListener implements EventListener{
	public void PersonWokeUp(Object sender, ActionEvent event) {
		System.out.println(String.format("%s completed\n%s", event.getActionCommand(), sender));
	}
}