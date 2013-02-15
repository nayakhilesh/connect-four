package connectfour.controller.ai.util;

public interface Ai {

	int move();
	
	void stop();
	
	void setDeterministic(boolean deterministic);
	
	void setTimeLimited(boolean timeLimited);
	
	void setTimeLimit(long timeLimit);
	
	void setDepthLimit(int depthLimit);
	
}