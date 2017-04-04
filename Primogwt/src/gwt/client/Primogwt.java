package gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.RepeatingCommand;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Primogwt implements EntryPoint {

	int i = 0;

	@Override
	public void onModuleLoad() {

		Board board = new Board();

//		for (int i = 0; i < 10; i++) {
//			Bubble bubble = new Bubble((int) (Math.random() * 55), (int) (Math.random() * 900), 0);
//
//			board.addBubble(bubble);
//		}

		DockLayoutPanel dlp = new DockLayoutPanel(Unit.PX);
		dlp.addNorth(new HTML(), 100);
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
