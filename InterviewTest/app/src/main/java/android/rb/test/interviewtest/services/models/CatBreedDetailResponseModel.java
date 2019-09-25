package android.rb.test.interviewtest.services.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CatBreedDetailResponseModel implements Serializable
{

    @SerializedName("breeds")
    @Expose
    private List<Breed> breeds = null;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    private final static long serialVersionUID = 7457176859655486984L;

    /**
     * No args constructor for use in serialization
     *
     */
    public CatBreedDetailResponseModel() {
    }

    /**
     *
     * @param id
     * @param height
     * @param width
     * @param breeds
     * @param url
     */
    public CatBreedDetailResponseModel(List<Breed> breeds, String id, String url, Integer width, Integer height) {
        super();
        this.breeds = breeds;
        this.id = id;
        this.url = url;
        this.width = width;
        this.height = height;
    }

    public List<Breed> getBreeds() {
        return breeds;
    }

    public void setBreeds(List<Breed> breeds) {
        this.breeds = breeds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

}