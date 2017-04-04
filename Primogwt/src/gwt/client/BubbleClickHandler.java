package gwt.client;


import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class BubbleClickHandler implements ClickHandler {
	Bubble bubble;
	Board board;
	
	public BubbleClickHandler(Bubble bubble, Board board){
		this.bubble = bubble;
		this.board = board;
	}
	
	@Override
	public void onClick(ClickEvent event) {
		board.removeBubble(bubble);
		GWT.log("bolle scoppiate");
	}

}
