package behaviordp.bdp07_observer;

public interface Subject {
	
	void attach(Observer observer);
	 
    void detach(Observer observer);
 
    void notifyAllObserver();
}
