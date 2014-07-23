package Data_objects_OLD;

/**
 * Created by OJT4 on 7/15/2014.
 */
public class Topics {

    private String topicName;
    private double relevancy;

    public void setRelevancy(double relevancy) {
        this.relevancy = relevancy;
    }

    public double getRelevancy() {
        return relevancy;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicName() {
        return topicName;
    }

}
