package src;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class EndlessLaughter {

	public static void main(String[] args) {

		File folder = new File("chapter8Exceptions\\laughter");

		File[] filesOfLaughter = folder.listFiles();

		for (int i = 0; i < filesOfLaughter.length; i++) {
			if (filesOfLaughter[i].isFile()) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(filesOfLaughter[i]));
					clip.start();
					TimeUnit.MICROSECONDS.sleep(clip.getMicrosecondLength() + 50);
					clip.close();
				} catch (LineUnavailableException e) {
					System.out.println("Line is not availlable and therefore cannot be opened");
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("Some kind of input/output exception");
					e.printStackTrace();
				} catch (UnsupportedAudioFileException e) {
					// log the error
					Logger.getLogger(EndlessLaughter.class.getSimpleName()).log(Level.SEVERE, e.getMessage(), e);
				} catch (InterruptedException e) {
					// no operation
				}
			} else {
				System.out.println("Seems like there is no file.");
			}
		}
	}
}
