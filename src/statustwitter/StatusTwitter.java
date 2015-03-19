package statustwitter;

import twitter4j.Paging;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Clase para recobrar los twitts del morrazo
 *
 * @author damian
 */
public class StatusTwitter {

    /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws TwitterException {

        Twitter twitter;
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("VnItYt2EEiPAymGQW01huMuXp")
                .setOAuthConsumerSecret("aE5Dygm2VbzfH9BokMGAvTEPhfIrBPOJX2nRvQFKId1t6rhLAa")
                .setOAuthAccessToken("779025319-KBKqeCiqBEXh0CqsvP8xL3wsSdmBWXEl2YGEqzQ4")
                .setOAuthAccessTokenSecret("WJIrTUkKi2LbXMYsax0mRDcxz5PC1olzXKyVzAGTnZVfJ");
        twitter = new TwitterFactory(cb.build()).getInstance();

        Paging pagina = new Paging();
        Twitter mitwitter = new TwitterFactory().getInstance();

        Query query = new Query("#Cangas");
        QueryResult result = mitwitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        }
    }
}
