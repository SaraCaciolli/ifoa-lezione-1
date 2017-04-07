package gioco.gameoflife.client;


import java.util.Set;

import com.google.gwt.core.client.GWT;

/**
 * Class Cell utilizzata per descrivere 
 * il comportamento di ciascuna cella.
 * @author MioNome
 *
 */
public class Cell extends BaseCell {
	public static final int ALIVE_CONDITION = 2;
	private Set<BaseCell> neighboors;
	

	public Cell(Coordinates coord) {
		super(coord);
	}
	
	public Cell(Coordinates coord, Set<BaseCell> neighboors) {
		super(coord);
		this.neighboors = neighboors;
	}
	
	public Cell(Coordinates coord, State stato, Set<BaseCell> neighboors) {
		super(coord, stato);
		this.neighboors = neighboors;
	}
	
	/**
	 * Serve per settare i vicini della cella.
	 * 
	 * 
	 * @param neighboors Insieme dei vicini
	 */
	public void setNeighboors(Set<BaseCell> neighboors) {
		this.neighboors = neighboors;
	}
	

	public void iterate() {
		int sum=(getState().getStato()?1:0);
		for(BaseCell elem:neighboors) {
			if(elem==null)
				GWT.log("Null");
			sum+=(elem.getState().isAlive()?1:0);
		}
		//System.out.println("Sum:"+sum);
		if(sum >= ALIVE_CONDITION) {
			GWT.log("Alive ("+getCoordinates().getX()+" - "+getCoordinates().getY()+") ");
			this.setState(new State(true));
		} else {
			this.setState(new State(false));
		}
	}
		
}

