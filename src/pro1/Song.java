package pro1;

public class Song {
	String title;
	String artist;
	int duration;
	public Song(){
		
	}
	public Song (String title,String artist,int duration){
		this.title=title;
		this.artist=artist;
		this.duration=duration;
	}
	public String getTitle(){
		return this.title;
	}
	public String getArtist(){
		return this.artist;
	}
	public int getDuration(){
		return this.duration;
	}
	public String toString(){
		return "Title: "+title+
				" Artist: "+artist+
				" Duration: "+duration;
	}
}
