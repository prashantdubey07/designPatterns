package com.prashant.behavioral.mediator;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorEveryDayDemo {
	private Toolkit toolKit;
	private Timer timer;

	public MediatorEveryDayDemo(int seconds) {
		timer = new Timer();
		toolKit = Toolkit.getDefaultToolkit();
		timer.schedule(new RemindTask(), seconds * 1000);
		timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
	}

	class RemindTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("times up");
			toolKit.beep();
		}

	}

	class RemindTaskWithoutBeep extends TimerTask {

		@Override
		public void run() {
			System.out.println("now times really up");
			timer.cancel();
		}

	}

	public static void main(String[] args) {
		System.out.println("adding task to schedule");
		new MediatorEveryDayDemo(3);
		System.out.println("task Scheduled");
	}

}
