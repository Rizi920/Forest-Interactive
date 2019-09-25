package android.rb.test.interviewtest.services.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weight implements Serializable
{

    @SerializedName("imperial")
    @Expose
    private String imperial;
    @SerializedName("metric")
    @Expose
    private String metric;
    private final static long serialVersionUID = -6921993300964208227L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Weight() {
    }

    /**
     *
     * @param imperial
     * @param metric
     */
    public Weight(String imperial, String metric) {
        super();
        this.imperial = imperial;
        this.metric = metric;
    }

    public String getImperial() {
        return imperial;
    }

    public void setImperial(String imperial) {
        this.imperial = imperial;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

}