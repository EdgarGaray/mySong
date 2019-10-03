public class Song
{
    //1) Instance variables
    private String title;
    private String artist; //can also be composer
    private boolean hasLyrics;
    private int length; //in seconds
    private double fileSize; //in megabytes

    //2) constructors
    //overload constructors (methods) have early binding
    public Song()
    {
        title = null;
        artist = null;
        hasLyrics = false;
        length = 0;
        fileSize = 0.0;
    }//end zero-arg or default

    public Song(String newTitle, String newArtist, boolean newHasLyrics)
    {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = 0;
        fileSize = 0.0;
    }// end three-arg constructor

    public Song(String newTitle, String newArtist, boolean newHasLyrics, int newLength, double newFileSize)
    {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = checkLength(newLength);
        fileSize = newFileSize;
    }//end multi-arg constructor

    //4. getters
    public String getTitle()
    {
        return title;
    }//title getter

    public String getArtist()
    {
        return artist;
    }//artist getter

    public boolean getHasLyrics()
    {
        return hasLyrics;
    }

    public int getLength()
    {
        return length;
    }

    public double getFileSize()
    {
        return fileSize;
    }//end

    //5) setters
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }//end Title settler

    public void setArtist(String newArtist)
    {
        artist = newArtist;
    }//end artist setter

    public void setHasLyrics(boolean newHasLyrics)
    {
        hasLyrics = newHasLyrics;
    }//end hasLyrics setter

    //pre-condition:the object exists
    //post-condition: length == newLength validated
    public void setLength(int newLength)
    {
        length = checkLength(newLength);
    }//end setLength

    //6) brain methods
    public String toMinSec()
    {
        int minutes = length / 60;
        int seconds = length % 60;
        return minutes + " min " + seconds + " sec";
    }//end

    /*
    CheckLength is a helper method. It is private because
    it "helps" the other public methods by validating entry.
    This is an example of decomposition - each method does
    just one thing
     */

    private int checkLength(int newLength)
    {
        int tempLength = newLength;
        if(tempLength < 0)
        {
            tempLength = 0;
        }//end if
        else if (tempLength > 1200)
        {
            tempLength = 1200;
        }//end else if
        return tempLength;
    }//end length validation method checkLength

    //3) toString a must have for every great object class
    public String toString()
    {
        String output = "";
        output += "Title: " + title;
        output += "\nArtist: " + artist;
        output += "\nHas Lyrics?: " + hasLyrics;
        output += "\nLength (in seconds): " + length;
        output += "\nFile Size (in mB): " + fileSize;

        return output;
    }//end toString
}//end class Song
