package aa224fn_assign3;

public class Radio {
	boolean on;
	int channel;
	int volume;

	public Radio() {
		channel = 1;
		volume = 1;
		on = false;
	}

	public Radio(int ch, int vl, boolean nw) {
		channel = ch;
		volume = vl;
		on = nw;
	}

	public String getSettings() {
		String x = "Settings: on ";
		x = x + on + ", Channel " + channel + ", Volume " + volume;
		return x;
	}

	public boolean turnOn() {
		on = true;
		return on;
	}

	public boolean turnOff() {
		channel = 1;
		volume = 1;
		on = false;
		if (on == false) {
			System.err.println("Radio is off Agasments can't be made ");
		}
		return on;

	}

	public void setVolume(int vl) {
		if (volume < 0 && volume > 5) {
			System.err.print("New volume not within range!");
		}

		else if (volume >= 0 && volume <= 5) {
			volume = vl;
		}

	}

	public void volumeUp() {
		if (volume < 0 && volume > 5) {
			System.err.print("New volume not within range!");
		} else if (volume >= 0 && volume <= 5) {
			volume = volume + 1;
		}

	}

	public void volumeDown() {

		if (volume < 0 && volume > 5) {
			System.err.print("New volume not within range!");
		} else if (volume >= 0 && volume <= 5) {
			volume = volume - 1;
		}
	}

	public void setChannel(int ch) {
		if (channel < 0 && channel > 10) {
			System.err.print("New channel not within range!");
		}
		if (ch >= 0 && ch <= 10) {
			channel = ch;
		}

	}

	public void channelUp() {

		if (channel < 0 && channel > 10) {
			System.err.print("New channel not within range!");
		}
		if (channel >= 0 && channel <= 10) {
			channel = channel + 1;
		}

	}

	public void channelDown() {
		if (channel < 0 && channel > 10) {
			System.err.print("New channel not within range!");
		} else if (channel >= 0 && channel <= 10) {

			channel = channel - 1;
		}
	}

}
