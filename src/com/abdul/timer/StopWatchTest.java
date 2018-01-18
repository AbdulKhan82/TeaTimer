package com.abdul.timer;

import java.io.IOException;
import org.apache.commons.lang3.time.StopWatch;

public class StopWatchTest {
	public static void main(String[] args) throws IOException {

		whichTea("green");
	}

	private static void whichTea(String tea) {
		StopWatch stopWatch = new StopWatch();

		System.out.println("STARTING STOPWATCH");
		stopWatch.start();

		if(tea == "green") {
			sleep(120000);

		System.out.println("Green Tea is done");
		}
		else if(tea == "black") {
			sleep(120000);
		}
		else if(tea == "white") {
				sleep(120000);
			}
		
		stopWatch.stop();
	}

	public static void sleep(int i) {
		System.out.println("Please enter you tea");
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

