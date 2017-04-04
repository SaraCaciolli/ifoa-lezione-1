package gwt.client;

import com.google.gwt.user.client.ui.HTML;

public class ScoreBoard extends HTML {
	int score;

	public void setScore(int score) {
		this.score = score;
		setHTML("" + score + "points");
	}

	public int getScore() {
		return this.score;
	}
}
