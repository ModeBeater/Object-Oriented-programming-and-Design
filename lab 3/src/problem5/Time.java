package problem5;


public class Time extends sort implements Comparable<Time>{
	public int hour,minute,second;
	public String h,m,s;
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		TimeToString(hour,minute,second);
	}
	void TimeToString(int hour, int minute, int second) {
		h = Integer.toString(hour);
		m = Integer.toString(minute);
		s = Integer.toString(second);
		if(hour <= 9) {
			h = '0' + Integer.toString(hour);
		}
		if(minute <= 9) {
			m = '0' + Integer.toString(minute);
		}
		if(second <= 9) {
			s = '0' + Integer.toString(second);
		}
	}
	public String toUniversal() {
		return h + ':' + m + ':' + s; 
	}
	public String toStandard() {
		String a = null;
		String ho = null;
		if(hour <= 12) {
			a = "AM";
			ho = Integer.toString(hour);
			if(hour < 10) {
				ho = '0' + Integer.toString(hour);
			}
		}
		if(hour > 12 && hour < 24) {
			a = "PM";
			hour = hour - 12;
			ho = Integer.toString(hour);
			if(hour < 10) {
				ho = '0' + Integer.toString(hour);
			}
			hour += 12;
		}
		return ho + ':' + m + ':' + s + ' ' + a;
	}
	public void add(Time t2) {
		this.hour += t2.hour;
		if(hour >= 24) {
			hour -= 24;
		}
		this.minute += t2.minute;
		if(minute >= 60) {
			minute -= 60;
		}
		this.second += t2.second;
		if(second >= 60) {
			second -= 60;
		}
		TimeToString(hour,minute,second);
	}
	@Override
	public int compareTo(Time o) {
		if(this.hour > o.hour) {
			return 1;
		}
		if(this.hour < o.hour) {
			return -1;
		}
		return 0;
	}
	public String toString() {
		return "Time:" + this.hour + " " + this.minute + " " + this.second;
	} 
}