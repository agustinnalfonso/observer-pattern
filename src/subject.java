import java.util.ArrayList;
import java.util.List;

class Subject {
    private String celebrityName;
    private List<observer> followers = new ArrayList<observer>();
    private int state;

    public Subject(String celebrityName) {
        this.celebrityName = celebrityName;
        followers = new ArrayList<observer>();
    }

    public int getState() {
        return state;
    }

    public void attach(observer observer){
        followers.add(observer);
    }

    public void notifyAllObservers(String tweet) {
        for(observer follower : followers)
        {
            follower.update(celebrityName, tweet);
        }
        System.out.println();
    }

    public void tweet(String tweet)
    {
        System.out.println("\n" + celebrityName + " has tweeted :: " + tweet + "\n");
        notifyAllObservers(tweet);
    }
}
