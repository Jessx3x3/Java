package hashmap;

public class Launcher {

	public static void main(String[] args) {
		
	TrackList hashClass = new TrackList();
	
	hashClass.addSong(title_1, letter_1);
	hashClass.addSong(title_2, letter_2);
	hashClass.addSong(title_3, letter_3);
	hashClass.addSong(title_4, letter_4);

	System.out.println("Lista de canciones: "+"\n");
	hashClass.printSong();
	
	System.out.println("Búsqueda de canciones: "+"\n");
	hashClass.searchSong("Stuck in the middle with you");
	
	}
	
	static String title_1 =     "Stuck in the middle with you";
	static String letter_1 =    "Well you started out with nothing,\r\n" + 
								"And you're proud that you're a self made man,\r\n" + 
								"And your friends, they all come crawlin,\r\n" + 
								"Slap you on the back and say,\r\n" + 
								"Please, please";
	
	static String title_2 =     "Sweet dreams are made of this";
	static String letter_2 =    "Sweet dreams are made of this\r\n" + 
								"Who am I to disagree?\r\n" + 
								"I travel the world\r\n" + 
								"And the seven seas\r\n" + 
								"Everybody's looking for something";
	
	static String title_3 =     "Every breath you take";
	static String letter_3 =    "Every breath you take and every move you make\r\n" + 
								"Every bond you break, every step you take (I'll be watching you)\r\n" + 
								"Every single day, every word you say\r\n" + 
								"Every game you play, every night you stay (I'll be watching you)\r\n" + 
								"Every move you make, every vow you break";
	
	static String title_4 = 	"Head over heels";
	static String letter_4 =	"Something happens and I'm head over heels\r\n" + 
								"I never find out till I'm head over heels\r\n" + 
								"Something happens and I'm head over heels\r\n" + 
								"Ah, don't take my heart, don't break my heart\r\n" + 
								"Don't, don't, don't throw it away";
}
