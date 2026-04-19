class Game {
    private String gameName;
    private double price;

    //game name
    public void setGameName(String gameName){
        this.gameName=gameName;
    }
    public String getGameName(){
        return gameName;
    }

    //price
     public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }

    // displayGameInfo
    public void displayGameInfo() {
        System.out.println("Game Name : "+gameName);
        System.out.println("Price     : "+price);
    }
}

class VideoGame extends Game{
    private String platform;
    private String genre;

    //platform
    public void setPlatform(String platform){
        this.platform=platform;
    }
    public String getPlatform(){
        return platform;
    }

    //genre
    public void setGenre(String genre){
        this.genre=genre;
    }
    public String getGenre(){
        return genre;
    }

    @Override
    public void displayGameInfo() {
        super.displayGameInfo();
        System.out.println("Platform  : "+ platform);
        System.out.println("Genre     : "+genre);
}
}

class BoardGame extends Game{
    private int numOfPlayers;
    private int avgplayTime;

    //number of players
    public void setnumOfPlayers(int numOfPlayers){
        this.numOfPlayers=numOfPlayers;
    }
    public int getnumOfPlayers(){
        return numOfPlayers;
    }

    //average play time
    public void setavgplayTime(int avgplayTime){
        this.avgplayTime=avgplayTime;
    }
    public int getavgplayTime(){
        return avgplayTime;
    }

    @Override
    public void displayGameInfo() {
        super.displayGameInfo();
        System.out.println("Number of players  : "+ numOfPlayers);
        System.out.println("Average Playtime   : "+avgplayTime+" minutes");
}
}
public class GameTest {

    public static void main(String[] args) {

        VideoGame vg = new VideoGame();
        vg.setGameName("Call of Duty");
        vg.setPrice(3000);
        vg.setPlatform("PC");
        vg.setGenre("Action");

        BoardGame bg = new BoardGame();
        bg.setGameName("Chess");
        bg.setPrice(500);
        bg.setnumOfPlayers(2);
        bg.setavgplayTime(20);

        System.out.println("Video Game Details:");
        vg.displayGameInfo();

        System.out.println("\nBoard Game Details:");
        bg.displayGameInfo();
    }
}
