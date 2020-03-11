package hashmap;

import java.util.HashMap;

public class TrackList {
	
	HashMap<String, Song> Canciones = new HashMap<String, Song>();
	
	public void addSong(String titulo, String letra){
		Song nuevaCancion = new Song(titulo, letra);
		Canciones.put(titulo, nuevaCancion);
	}
	public void printSong() {
		
		for (String keys : this.Canciones.keySet())  
		{
		   System.out.println(keys);
		}
		
	}
	public void searchSong(String title) {
		
		if(Canciones.containsKey(title)) {
			Song newSong = Canciones.get(title);
			
			System.out.println(newSong.titulo+"\n");
			System.out.println(newSong.letra);
		}
		
	}

}
