public class observer{

    private String followerName;

    public observer(String followerName) {
        this.followerName = followerName;
    }

    public void update(String celebrityName , String tweet) {
        System.out.println(followerName + " has received "+ celebrityName + "'s tweet :: "+  tweet);

    }
}
