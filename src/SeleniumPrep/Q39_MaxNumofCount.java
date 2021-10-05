package SeleniumPrep;

import java.util.Arrays;

public class Q39_MaxNumofCount {
	// 39. WAP to Find the Maximum that can be played in 20 min if the duration of
	// songs are in an Array {2,4,5,8,4,,10,7,5}
	public static void main(String[] args) {
		int[] songs = {2,4,5,8,4,3,10,7,5};
		System.out.println("Max number of songs:"+maxNumofSongs(songs));
	}

	static int maxNumofSongs(int[] songs) {
		int numberOfSongs = 0;
		int sum =0;
		Arrays.sort(songs);
		for(int i=0;i<songs.length;i++) {
			sum=sum+songs[i];
			numberOfSongs++;
			if(sum>20) {
				return numberOfSongs-1;
			}
		}
		return numberOfSongs;
	}
}
