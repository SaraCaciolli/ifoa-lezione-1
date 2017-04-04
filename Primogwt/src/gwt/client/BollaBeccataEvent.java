package gwt.client;

import com.google.web.bindery.event.shared.Event;

public class BollaBeccataEvent extends Event<BollaBeccataEvent.Handler> {
	public interface Handler{
		public void onBubbleBeccata(BollaBeccataEvent be);
	}
	
	public static final Type<BollaBeccataEvent.Handler> TYPE = new Type<>();
	
	public BollaBeccataEvent(Bubble bubble) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Type<BollaBeccataEvent.Handler> getAssociatedType(){
		return TYPE;
	}
	
	@Override
	protected void dispatch(BollaBeccataEvent.Handler handler) {
		handler.onBubbleBeccata(this);
	}

}
