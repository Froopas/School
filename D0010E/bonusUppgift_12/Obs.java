package bonusUppgift_12;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Creates and tests the classes Observatör and Betraktad which
 * extends/implements MyObservable and Myobserver respectively
 * 
 * @author Anton Johansson
 *
 */

public class Obs {

	public static void main(String[] args) {
		Betraktad b = new Betraktad();
		new Observator(1, b);
		new Observator(2, b);

		b.agera();
	}

}

/**
 * Extends the class MyObservable and acts as a Observable
 * 
 * @author Anton Johansson
 *
 */

class Betraktad extends MyObservable {
	/**
	 * called for when Betraktad is updated and the observer needs to know about it
	 */
	public void agera() {
		System.out.println("I Betraktad.");
		setChanged(); // ja, jag har "ändrats"
		notifyObservers(); // anropa update i alla tjuvkikare
	}
}

/**
 * This class implements the MyObserver interface to observe an observable object
 * @author Anton Johansson
 *
 */

class Observator implements MyObserver {
	private int nr = 0;

	/**
	 * Creates an observer to an observable object obs with number n
	 * 
	 * @param n
	 *            the number of the observer
	 * @param obs
	 *            the observable object this object is going to observe
	 */
	public Observator(int n, MyObservable obs) {
		nr = n;
		obs.addObserver(this);
	}

	/**
	 * Is called automatically from the observed object
	 */
	public void update(MyObservable arg0, Object arg1) { // agera på ändring
		System.out.println("Hos Observatör " + nr);
	}
}

/**
 * This class represents an observable object, or "data" in the model-view
 * paradigm. It can be subclassed to represent an object that the application
 * wants to have observed. An observable object can have one or more observers.
 * An observer may be any object that implements interface MyObserver. After an
 * observable instance changes, an application calling the MyObservable's
 * notifyObservers method causes all of its observers to be notified of the
 * change by a call to their update method.
 * 
 * The order in which notifications will be delivered is unspecified. The
 * default implementation provided in the Observable class will notify Observers
 * in the order in which they registered interest, but subclasses may change
 * this order, use no guaranteed order, deliver notifications on separate
 * threads, or may guarantee that their subclass follows this order, as they
 * choose.
 * 
 * Note that this notification mechanism is has nothing to do with threads and
 * is completely separate from the wait and notify mechanism of class Object.
 * 
 * When an observable object is newly created, its set of observers is empty.
 * Two observers are considered the same if and only if the equals method
 * returns true for them.
 * 
 * @author Anton Johansson
 *
 */

class MyObservable {
	private ArrayList<MyObserver> observers;
	private boolean changed = false;

	/**
	 * Construct an Observable with zero Observers.
	 * 
	 */
	public MyObservable() {
		observers = new ArrayList<MyObserver>();
	}

	/**
	 * Adds an observer to the set of observers for this object, provided that it is
	 * not the same as some observer already in the set. The order in which
	 * notifications will be delivered to multiple observers is not specified. See
	 * the class comment.
	 * 
	 * @param o
	 *            an observer to be added.
	 * @throws NullPointerException
	 *             if the parameter o is null.
	 */
	public void addObserver(MyObserver o) throws NullPointerException {
		if (o == null)
			throw new NullPointerException();
		observers.add(o);
	}

	/**
	 * Indicates that this object has no longer changed, or that it has already
	 * notified all of its observers of its most recent change, so that the
	 * hasChanged method will now return false. This method is called automatically
	 * by the notifyObservers methods.
	 * 
	 */
	protected void clearChanged() {
		changed = false;
	}

	/**
	 * Returns the number of observers of this Observable object.
	 * 
	 * @return the number of observers of this object.
	 */

	public int countObservers() {
		return observers.size();
	}

	/**
	 * Deletes an observer from the set of observers of this object. Passing null to
	 * this method will have no effect.
	 * 
	 * @param o
	 *            the observer to be deleted.
	 */

	public void deleteObserver(MyObserver o) {
		observers.remove(o);
	}

	/**
	 * Clears the observer list so that this object no longer has any observers.
	 */

	public void deleteObservers() {
		observers.clear();
	}

	/**
	 * Tests if this object has changed.
	 * 
	 * @return true if and only if the setChanged method has been called more
	 *         recently than the clearChanged method on this object; false
	 *         otherwise.
	 */

	public boolean hasChanged() {
		return changed;
	}

	/**
	 * If this object has changed, as indicated by the hasChanged method, then
	 * notify all of its observers and then call the clearChanged method to indicate
	 * that this object has no longer changed. Each observer has its update method
	 * called with two arguments: this observable object and null. In other words,
	 * this method is equivalent to:
	 * 
	 * notifyObservers(null)
	 * 
	 */

	public void notifyObservers() {
		this.notifyObservers(null);
	}

	/**
	 * If this object has changed, as indicated by the hasChanged method, then
	 * notify all of its observers and then call the clearChanged method to indicate
	 * that this object has no longer changed. Each observer has its update method
	 * called with two arguments: this observable object and the arg argument.
	 * 
	 * @param arg
	 *            any object
	 */

	public void notifyObservers(Object arg) {
		if (this.hasChanged()) {
			for (MyObserver e : observers) {
				e.update(this, arg);
			}
			this.clearChanged();
		}

	}

	/**
	 * Marks this Observable object as having been changed; the hasChanged method
	 * will now return true.
	 */

	protected void setChanged() {
		changed = true;
	}
}

/**
 * A class can implement the MyObserver interface when it wants to be informed
 * of changes in observable objects.
 * 
 * @author Anton Johansson
 *
 */

interface MyObserver {

	/**
	 * This method is called whenever the observed object is changed. An application
	 * calls an MyObservable object's notifyObservers method to have all the
	 * object's observers notified of the change.
	 * 
	 * @param o
	 *            the observable object
	 * @param arg
	 *            an argument passed to the notifyObservers method
	 */
	void update(MyObservable o, Object arg);
}