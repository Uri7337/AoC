/*
 *  Autor: ondrej.pavlicek@ahasware.cz
 */
package Shared;

/**
 *
 * @author opavlicek
 */
public class Progress {
	final long progressStart = System.currentTimeMillis();
	final long progressMax;
	final long progressStep;
	long progressInc = 0;
	long progress = 0;

	public Progress(long progressMax) {
		this(progressMax, progressMax/100);
	}
	public Progress(long progressMax, long progressStep) {
		this.progressMax = progressMax;
		this.progressStep = progressStep;
	}

	public void progress() {
		progress++;
		progressInc++;
		if (progressInc >= progressStep) {
			progressInc = 0;
			final double duration = System.currentTimeMillis()-progressStart;
			final double percent = ((double)progress) / progressMax;
			final double part = ((double)progressMax)/progress;
			final long remain = (long)(duration*part - duration);
			long millis = remain % 1000;
			long second = (remain / 1000) % 60;
			long minute = (remain / (1000 * 60)) % 60;
			long hour = (remain / (1000 * 60 * 60));
			System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b"+String.format("%.4f%%, remain: %02d:%02d:%02d.%d",percent,hour, minute, second, millis));
			;
			
		}
	}
}
