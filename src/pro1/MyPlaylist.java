package pro1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyPlaylist {
     
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Playlist playlist = new Playlist();
		playlist.songs=new Song[100];
		System.out.print("Welcome to my playlist!");
		char b=0;
		do{
			if(b=='1'){
				  String song_tiltle="";  
				  String song_artist="";
				  int song_duration=0;			  
			      InputStreamReader ir = new InputStreamReader(System.in);  
			      BufferedReader in = new BufferedReader(ir);
			     
			      		in.readLine();
			        	System.out.println("Title of the song:");
			        	if((song_tiltle = in.readLine()) != null);{
			        	System.out.println("Name of the artist:");
			        	}
			        	if((song_artist = in.readLine()) != null){
			        	System.out.println("Duration (seconds):");
			        	song_duration = Integer.parseInt(in.readLine());		        			                     
			        	}
			       // in.close(); 
			        
				Song song =new Song(song_tiltle,song_artist,song_duration);
			//	System.out.println(song.toString());
				
				
				
				playlist.addSong(song);
				
				
					
			}else if(b=='2'){
			 	playlist.displayPlaylist();
			}else if(b=='3'){
			 	System.out.println(playlist.getTotalPlayTime());
			}
				if(b==0||b=='1'||b=='2'||b=='3'||b=='4'){
				System.out.println("\n1 - Add a new song\n"+
									"2 - List all songs\n"+
									"3 - Display total playtime\n"+
									"4 - exit\n");
				System.out.print("Please enter your choice:");
				}		
		
		
		}while( (b = (char) System.in.read())!= '4');
		System.out.println("Thank you. Bye!");
		
	}

}
