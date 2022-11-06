import java.util.ArrayList;
import java.util.Scanner;

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

int id = 1;
         for(Songs song : songs){
            System.out.print("ID: " + id+"\t");
            song.print();
            id++;
         }
         String q2 = InputReader.getString("would you like to add a song ? >");
         if (q2.equalsIgnoreCase("yes") ) {
          
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
    
  }
  else {
    System.out.println("okey");
}
  

    String q3 =InputReader.getString("Would you like to remove a song yes/no ? ");
    if (q3.equalsIgnoreCase("yes") ) {
    
    int q4 =InputReader.getInt("Choose the songs in order from 0 to 14>");
    if ( q4 <= 14  ) {
    String q5 = InputReader.getString("Are you sure you want to remove song number " + q4 + "? >");
    if (q5.equalsIgnoreCase("yes") ) {
    songs.remove(q4);
    int idr = 1; 
    for (Songs i : songs) {
      System.out.print("ID: 0"+ idr+ "\t");
      idr++;
      i.print();
                          }
                        }
                        }
  else {
    System.out.println("Try to submit a number from  0 to 14");
    int q8 =InputReader.getInt("Choose the songs in order from 0 to 14>");
    if ( q8 <= 14  ) {
      String q9 = InputReader.getString("Are you sure you want to remove song number " + q8 + "? >");
      if (q9.equalsIgnoreCase("yes") ) {
      }
      songs.remove(q8);
      for (Songs i : songs) {
        System.out.print("ID: 0 ");
        i.print();
}
}
}


    }
    else {
      System.out.println("Thanks for using the program good bye :)");
      }

   try (Scanner choose = new Scanner(System.in)) {
    System.out.println("Please enter the number of playcounts for the songs you are looking for :  ");
    int playcount = choose.nextInt();
   
   System.out.println("The songs are :");

   for(Songs song : songs){
    if ( playcount <= song.getPlaycount()){
      song.print();
    }

   }
  }
}
else {
  System.out.println("Good bye.");
}

}

}