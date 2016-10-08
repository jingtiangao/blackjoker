package pro1;

public class Playlist {
	public Song[] songs;
	public int totalSongs=0;
	
	/*public Playlist(Song song){
		this.songs[0]=song;
	}*/
	/**
	 * 
	 * @author 
	 * @param addsong
	 * @return void
	 */
	public void addSong(Song song){
	;
		songs[totalSongs]=song;
		totalSongs++;
		
	
	}
	/**
	 * 
	 * @return int 
	 */
	public int getTotalPlayTime(){
		int sum=0;
		for(int i=0;i<totalSongs;i++){
			sum+=songs[i].getDuration();
		}
		
		return sum;
	}
	public void displayPlaylist(){
		for(int i=0;i<totalSongs;i++){
			System.out.println(songs[i].toString());
			
		}
	}

}
