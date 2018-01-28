package bonusuppgift_3;
/**
 * 
 * @author Anton Johansson D0010E
 *
 */

public class Stopwatch {
	private boolean m_Running;
	private long m_TimeMs;
	private long m_SavedTime=0;
	
	Stopwatch(){
		m_Running = false;
		m_TimeMs=System.currentTimeMillis();
	}
	void Start(){
		m_TimeMs=System.currentTimeMillis();
		m_Running=true;
	}
	boolean isRunning() {
		return m_Running;
	}
	void Stop() {
		m_SavedTime+=System.currentTimeMillis()-m_TimeMs;
		m_Running=false;
	}
	void Reset() {
		m_TimeMs=System.currentTimeMillis();
		m_SavedTime=0;
	}
	long Time() {
		if(m_Running)
			return m_SavedTime+(System.currentTimeMillis()-m_TimeMs);
		return m_SavedTime;
	}

	
	public static void main(String[] args) {
		Stopwatch s1=new Stopwatch();
		s1.Stop();
		System.out.println(s1.isRunning());
		System.out.println(s1.Time());
		s1.Start();
		System.out.println(s1.isRunning());
		int count=0;
		while(500000>count++) {
			
		}
		System.out.println(s1.Time());
		s1.Stop();
		s1.isRunning();
		count =0;
		while(500000>count++) {
			
		}
		System.out.println(s1.Time());
		s1.Start();
		count =0;
		while(500000>count++) {
			
		}
		System.out.println(s1.Time());
	}
}
