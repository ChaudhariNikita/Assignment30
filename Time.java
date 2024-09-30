package Assignment30;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public Time(int hours, int minutes, int seconds) {
		if (hours >= 0 && hours < 24)
			this.hours = hours;

		if (minutes >= 0 && seconds < 60)
			this.minutes = minutes;

		if (seconds >= 0 && seconds < 60)
			this.seconds = seconds;
	}

	public void display() {
		System.out.println("Time :" + hours + ":" + minutes + ":" + seconds);
	}
}
