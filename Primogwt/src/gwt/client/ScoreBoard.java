package gwt.client;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.HTML;

public class ScoreBoard extends HTML {
	int score;
	SimpleEventBus bus;
	
	public ScoreBoard(SimpleEventBus bus){
		this.bus = bus;
		
		bus.addHandler(BollaBeccataEvent.TYPE, b ->setScore(getScore()+10));
		
	}

	public void setScore(int score) {
		this.score = score;
		setHTML("" + score + "points");
	}

	public int getScore() {
		return this.score;
	}
}
