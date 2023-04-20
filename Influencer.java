package prj5;

//Virginia Tech Honor Code Pledge:
//
//As a Hokie, I will conduct myself with honor and integrity at all times.
//I will not lie, cheat, or steal, nor will I accept the actions of those 
//who do.
//-- Hemen Tessema (9064-80853)


/**
*This class is a data structure that implements 
* QueueInterface with a circular array implementation. 
* It provides default queue behavior
* @author Hemen Tessema
* @version 2023-04-21
*
*/
public class Influencer {
    private String channel;
    private String country;
    private String topic;
    private int marchFollowers;
    private int totalViews;
    
    public Influencer(String channel, String country, String topic, int marchFollowers, int totalViews) {
        this.channel = channel;
        this.country = country;
        this.topic = topic;
        this.marchFollowers = marchFollowers;
        this.totalViews = totalViews;
    }
    
    public String getMonth() {
        return "March";
    }
    
    public String getChannel() {
        return channel;
    }
    
    public String getCountry() {
        return country;
    }
    
    public String getTopic() {
        return topic;
    }
    
    public double getTraditionalEngagementRate() {
        return (double) marchFollowers / 1000;
    }
    
    public double getReachEngagementRate() {
        return (double) totalViews / 1000;
    }

}
