package Driver;

import mx.bigdata.jcalais.CalaisClient;
import mx.bigdata.jcalais.CalaisConfig;
import mx.bigdata.jcalais.rest.CalaisRestClient;

/**
 * Created by OJT4 on 7/18/2014.
 */
public final class OpenCalaisConfiguration {

//    private final static Logger LOGGER = Logger.getLogger(OpenCalaisConfiguration.class.getName());
    public static class OpenCalaisConfigurationBuilder {
        private final String APIKEY;
        private String externalID;
        private boolean calculateRelevanceScore = true;
        private int connectionTimeout = 1000;
        private int readTimeout = 1000;

        private OpenCalaisConfigurationBuilder(String APIKEY) {
            this.APIKEY = APIKEY;
        }

        public OpenCalaisConfiguration build() {
            return new OpenCalaisConfiguration(this);
        }

        public OpenCalaisConfigurationBuilder externalID(String externalID) {
            this.externalID= externalID;
            return this;
        }

        public OpenCalaisConfigurationBuilder calculateRelevanceScore() {
            this.calculateRelevanceScore = true;
            return this;
        }

        public OpenCalaisConfigurationBuilder calculateRelevanceScore(Boolean calculateRelevanceScore) {
            this.calculateRelevanceScore = calculateRelevanceScore;
            return  this;
        }

        public OpenCalaisConfigurationBuilder connectionTimeout() {
            this.connectionTimeout = 1000;
            return this;
        }

        public OpenCalaisConfigurationBuilder connectionTimeout(int connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        public OpenCalaisConfigurationBuilder readTimeout() {
           this.readTimeout = 1000;
            return this;
        }

        public OpenCalaisConfigurationBuilder readTimeout(int readTimeout) {
            this.readTimeout = readTimeout;
            return this;
        }

        public static OpenCalaisConfigurationBuilder create(String APIKEY) {
            return new OpenCalaisConfigurationBuilder(APIKEY);
        }
    }

    private final String APIKEY;
    private String externalID;
    private boolean calculateRelevanceScore = true;
    private int connectionTimeout = 1000;
    private int readTimeout= 1000;



    private OpenCalaisConfiguration(OpenCalaisConfigurationBuilder builder) {
        this.APIKEY = builder.APIKEY;
        this.calculateRelevanceScore = builder.calculateRelevanceScore;
        this.connectionTimeout= builder.connectionTimeout;
        this.externalID = builder.externalID;
        this.readTimeout = builder.readTimeout;
    }

    public OpenCalaisConfiguration(String APIKEY) {
        this(OpenCalaisConfigurationBuilder.create(APIKEY));
    }


    public CalaisConfig runConfig() {
        CalaisConfig config = new CalaisConfig();
        if (externalID!=null) {
            config.set(CalaisConfig.UserParam.EXTERNAL_ID, externalID);
        }
        config.set(CalaisConfig.ProcessingParam.CALCULATE_RELEVANCE_SCORE,calculateRelevanceScore?"true":"false");
        config.set(CalaisConfig.ConnParam.CONNECT_TIMEOUT, connectionTimeout);
        config.set(CalaisConfig.ConnParam.READ_TIMEOUT, readTimeout);

        return config;
    }

    public CalaisClient runAnalyzer() {
        CalaisClient client = null;
        if (APIKEY.isEmpty()) {
            throw new IllegalArgumentException("Must provide an APIKEY");
        }
        else {
            try{
                client = new CalaisRestClient(APIKEY);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return client;
        }

    }

}
