package prj5;
import student.TestCase;
//import static org.junit.Assert.*;
//import org.junit.Test;

public class InfluencerTest extends TestCase{

    public void testGetMonth() {
        Influencer influencer = new Influencer("Channel 1", "Country 1", "Topic 1", 10000, 50000);
        assertEquals("March", influencer.getMonth());
    }
    
   
    public void testGetChannel() {
        Influencer influencer = new Influencer("Channel 1", "Country 1", "Topic 1", 10000, 50000);
        assertEquals("Channel 1", influencer.getChannel());
    }
    
    
    public void testGetCountry() {
        Influencer influencer = new Influencer("Channel 1", "Country 1", "Topic 1", 10000, 50000);
        assertEquals("Country 1", influencer.getCountry());
    }
    
   
    public void testGetTopic() {
        Influencer influencer = new Influencer("Channel 1", "Country 1", "Topic 1", 10000, 50000);
        assertEquals("Topic 1", influencer.getTopic());
    }
    
    
    public void testGetTraditionalEngagementRate() {
        Influencer influencer = new Influencer("Channel 1", "Country 1", "Topic 1", 10000, 50000);
        assertEquals(10.0, influencer.getTraditionalEngagementRate(), 0.0);
    }
    

    public void testGetReachEngagementRate() {
        Influencer influencer = new Influencer("Channel 1", "Country 1", "Topic 1", 10000, 50000);
        assertEquals(50.0, influencer.getReachEngagementRate(), 0.0);
    }

}

