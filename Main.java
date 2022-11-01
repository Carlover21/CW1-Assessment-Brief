import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println ("Rayan's CW1 ");
        System.out.println("Hello user :)");
        String name = InputReader.getString("Enter your name > ");
        System.out.println("Hello " + name);
        String q1 = InputReader.getString("Would you like to listen to music  yes/no ?>");

         if (q1.equalsIgnoreCase("yes") ) {
      System.out.println("this is the list of songs");
     


    
        Songs celine3x = new Songs("CELINE 3x", "GAZO", 26612713);
        Songs mauvaisx2  = new Songs("MAUVAIS 2X", "GAZO x NINHO", 25218394);
        Songs tdb = new Songs("TDB", "OBOY", 59837163);
        Songs balader = new Songs("Balader", "Soolking feat Niska", 56068714);
        Songs attentat = new Songs("Attentat", "PLK", 13116061);
        Songs bandeorganisée = new Songs("Bande Organisée", "Sch / Kofs / Jul / Naps / Soso maness / Elams / Solda / Houari ", 424525472);
        Songs gangstasparadice = new Songs("Gansta's Paradice", "Coolio", 1098971655);
        Songs puffinonzootiez  = new Songs( "PUFFIN ON ZOOTIEZ","Future"  , 17502707);
        Songs luciddreams = new Songs("Lucid Dreams", "Juice WRLD", 849411712);
        Songs memyself = new Songs("Me, Myself & I","G-Eazy x Bebe Rexha" , 573436155);
        Songs oneup = new Songs("One Up", "Central Cee", 423611);
        Songs ferrari = new Songs("Ferrari", "Pop Smoke ft. Central Cee, Tion Wayne & Russ Million", 7277178);
        Songs lif = new Songs("LIF", "SCH", 1609166);
        Songs b3ida = new Songs("B3ida", "Flenn", 15630088);
      
        
        
         ArrayList<Songs> songs = new ArrayList<Songs>();
         songs.add(celine3x);
         songs.add(mauvaisx2);
         songs.add(tdb);
         songs.add(balader);
         songs.add(attentat);
         songs.add(bandeorganisée);
         songs.add(gangstasparadice);
         songs.add(puffinonzootiez);
         songs.add(luciddreams);
         songs.add(memyself);
         songs.add(oneup);
         songs.add(ferrari);
         songs.add(lif);
         songs.add(b3ida);

/* 
         songs.remove();
        
*/
int id = 1;
         for(Songs song : songs){
            System.out.print("ID: " + id+"\t");
            song.print();
            id++;
         }
         String q2 = InputReader.getString("would you like to add a song ? >");
    String songsadd = InputReader.getString("Enter the name of the song : >");
    String artistadd = InputReader.getString("Enter the name of the artist : >");
    int playcountadd = InputReader.getInt("Enter the playcount : >"); 
    System.out.print("SONG:" + songsadd +"\t");
    System.out.print("ARTIST:" + artistadd +"\t");
    System.out.println("PLAYCOUNT:" + playcountadd +"\t");
    Songs newsong = new Songs(songsadd, artistadd, playcountadd);
    songs.add(newsong);
    for (Songs i : songs) {
      i.print();
    }

    int q3 =InputReader.getInt("Would you like to remove a song ? (choose the songs in order from 0 to 14)>");
    String q4 = InputReader.getString("are you sure you want to remove song number " + q3 + "? >");
    if (q4.equalsIgnoreCase("yes") ) {

    

    songs.remove(q3);
    for (Songs i : songs) {
      System.out.print("ID: 0 ");
      i.print();
    }
   }
    

         }
         else {
            System.out.println("Good bye.");
    }
    
}

} 