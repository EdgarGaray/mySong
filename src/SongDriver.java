public class SongDriver
{
    public static void main(String args[])
    {
        //1. Create a song
        Song someSong = new Song();
        Song fireworks = new Song("Fireworks", "Katy Perry", true, 234, 6.94);
        Song deadLochs = new Song("Deadlochs", "Blueface", true, 150, 3.47);
        Song overture = new Song("1812 Overture", "Petyr Ilych Tchaicovsky", false, 1093, 110);
        Song happySong = new Song();

        deadLochs.setLength(-5);
        System.out.println(deadLochs);
        /*fireworks.title = "Happy Song";
        System.out.println(fireworks);

        //3. testing getters
        System.out.println(fireworks.getTitle());
        System.out.println(deadLochs.getArtist());
        System.out.println(overture.getHasLyrics());
        System.out.println(fireworks.getLength());
        System.out.println(fireworks.getFileSize());

        System.out.println("In minutes: " + overture.toMinSec());

        //testing getters
        System.out.println("\n" + someSong + "\n");
        someSong.setTitle("SksksSKksks");
        someSong.setArtist("Thotiania");
        someSong.setHasLyrics(false);
        System.out.println(someSong);

        //2.Print it out
        System.out.println(happySong);
        System.out.println(fireworks);
        System.out.println();
        System.out.println(deadLochs);
        System.out.println();
        System.out.println(overture);


        */
    }//end main method

}//end class SongDriver. This is where all the fin stuff happens
