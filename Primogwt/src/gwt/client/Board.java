package gwt.client;

import java.util.ArrayList;
import java.util.List;


import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlowPanel;

public class Board extends FlowPanel {
	
	List<Bubble> bubbles = new ArrayList<>();
	
	public Board() {
		this.getElement().getStyle().setWidth(100, Unit.PCT);
		this.getElement().getStyle().setHeight(100, Unit.PCT);
		this.getElement().getStyle().setBackgroundColor("black");
		this.getElement().getStyle().setBorderColor("black");
	}
	
	public void addBubble(Bubble bubble){
		bubbles.add(bubble);
		this.add(bubble);
		bubble.addClickHandler(new BubbleClickHandler(bubble, this));
	}
	
	public void removeBubble(Bubble bubble){
		bubbles.remove(bubble);
		this.remove(bubble);
	}
	
	public void move(){
		int bh = this.getOffsetHeight();
		for (Bubble b : bubbles) {
			b.moveBy((int) ((Math.random() - 0.5) * 3), (int) ((Math.random() + 1) * 3));
			if(b.getPosition() > bh)
				this.removeBubble(b);
		}
		//GWT.log("h" + this.getOffsetHeight());
	}
	
	public int size(){
		return bubbles.size();
	}
}