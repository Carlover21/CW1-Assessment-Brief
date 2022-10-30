public class Songs {
    private String songs;
    private String artist;
    private int playcount;

    //Constructor
    public Songs(String songs, String artist, int playcount)
    {
         this.songs= songs;
         this.artist= artist;
         this.playcount= playcount;
    }
    
    //print method
    public void print()
    {
       System.out.print("SONG:"+ this.songs + "\t");
<<<<<<< HEAD
       System.out.println("ARTIST: "+this.artist + "\t");
=======
       System.out.print("ARTIST: "+this.artist + "\t");
>>>>>>> f777de6ba58cd9b8d86a8deea202d898c37e9d7b
       System.out.println("PLAYCOUNT: "+this.playcount + "\t");
    }


}
