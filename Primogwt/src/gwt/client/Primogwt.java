package gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.RepeatingCommand;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Primogwt implements EntryPoint {

	GreetingServiceAsync servizio = GWT.create(GreetingService.class);
	
	
	int i = 0;

	@Override
	public void onModuleLoad() {

		servizio.salvaPunteggio("Sara", 99999, new AsyncCallback<Void>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(Void result) {
				// TODO Auto-generated method stub
				
			}
		});
	
		SimpleEventBus bus = new SimpleEventBus();
	
		Board board = new Board(bus);
		
		for (int i = 0; i < 10; i++) {
			Bubble bubble = new Bubble((int) (Math.random() * 55), (int) (Math.random() * 900), 0);

			board.addBubble(bubble);
		}

		DockLayoutPanel dlp = new DockLayoutPanel(Unit.PX);
		
		ScoreBoard scoreBoard = new ScoreBoard(bus);
		scoreBoard.setScore(0);
		
		dlp.addNorth(scoreBoard, 100);
		dlp.addSouth(new HTML(), 100);
		dlp.addEast(new HTML(), 100);
		dlp.addWest(new HTML(), 100);

		dlp.add(board);

		RootLayoutPanel.get().add(dlp);

		// muove le bubble
		Scheduler.get().scheduleFixedDelay(new RepeatingCommand() {
			@Override
			public boolean execute() {

				board.move();
				return true;
			}
		}, 100);

		// fa nascere nuove bubble
		Scheduler.get().scheduleFixedDelay(new RepeatingCommand() {
			@Override
			public boolean execute() {
				
				if(board.size() < 200 ){
				Bubble bubble = new Bubble((int) (Math.random() * 55), (int) (Math.random() * 900), 0);
				board.addBubble(bubble);
				}
				return true;
			}
		}, 100);
	}

}
