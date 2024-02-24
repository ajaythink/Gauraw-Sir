public class SpotifySong {
    
    private String title;
    private String artist;
    private String album;
    private String genre;
    private int duration;
    private int release_year;
    private int popularity;

    public String getTitle(){
        return title;
    } 
    public String getArtist(){
        return artist;
    } 
    public String getAlbum(){
        return album;
    }
    public String getGenre(){
        return genre;
    }
    public int getDuration(){
        return duration;
    }
    public int getRelease_year(){
        return release_year;
    }
    public int getPopularity(){
        return popularity;
    }

    public SpotifySong(String title, String artist, String album, String genre, int duration, int release_year, int popularity){
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.duration = duration;
    }
    
}