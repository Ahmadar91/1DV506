package aa224fn_assign3;

import aa224fn_assign3.AlarmClock;

public class AlarmMain {

	public static void main(String[] args) {
		AlarmClock ac = new AlarmClock(23, 48);
		ac.displayTime();
		ac.setAlarm(6, 27);
		ac.displayAlarmTime();
		for (int i = 0; i < 500; i++) {
		ac.timeTick();
		}
		ac.displayTime();

	}

}
