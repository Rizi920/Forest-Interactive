package android.rb.test.interviewtest.services.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllCatBreedsResponseModel implements Serializable
{

    @SerializedName("adaptability")
    @Expose
    private Integer adaptability;
    @SerializedName("affection_level")
    @Expose
    private Integer affectionLevel;
    @SerializedName("alt_names")
    @Expose
    private String altNames;
    @SerializedName("cfa_url")
    @Expose
    private String cfaUrl;
    @SerializedName("child_friendly")
    @Expose
    private Integer childFriendly;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("country_codes")
    @Expose
    private String countryCodes;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("dog_friendly")
    @Expose
    private Integer dogFriendly;
    @SerializedName("energy_level")
    @Expose
    private Integer energyLevel;
    @SerializedName("experimental")
    @Expose
    private Integer experimental;
    @SerializedName("grooming")
    @Expose
    private Integer grooming;
    @SerializedName("hairless")
    @Expose
    private Integer hairless;
    @SerializedName("health_issues")
    @Expose
    private Integer healthIssues;
    @SerializedName("hypoallergenic")
    @Expose
    private Integer hypoallergenic;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("indoor")
    @Expose
    private Integer indoor;
    @SerializedName("intelligence")
    @Expose
    private Integer intelligence;
    @SerializedName("lap")
    @Expose
    private Integer lap;
    @SerializedName("life_span")
    @Expose
    private String lifeSpan;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("natural")
    @Expose
    private Integer natural;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("rare")
    @Expose
    private Integer rare;
    @SerializedName("rex")
    @Expose
    private Integer rex;
    @SerializedName("shedding_level")
    @Expose
    private Integer sheddingLevel;
    @SerializedName("short_legs")
    @Expose
    private Integer shortLegs;
    @SerializedName("social_needs")
    @Expose
    private Integer socialNeeds;
    @SerializedName("stranger_friendly")
    @Expose
    private Integer strangerFriendly;
    @SerializedName("suppressed_tail")
    @Expose
    private Integer suppressedTail;
    @SerializedName("temperament")
    @Expose
    private String temperament;
    @SerializedName("vcahospitals_url")
    @Expose
    private String vcahospitalsUrl;
    @SerializedName("vetstreet_url")
    @Expose
    private String vetstreetUrl;
    @SerializedName("vocalisation")
    @Expose
    private Integer vocalisation;
    @SerializedName("weight")
    @Expose
    private Weight weight;
    @SerializedName("wikipedia_url")
    @Expose
    private String wikipediaUrl;
    private final static long serialVersionUID = 3770023857144004682L;

    /**
     * No args constructor for use in serialization
     *
     */
    public AllCatBreedsResponseModel() {
    }

    /**
     *
     * @param grooming
     * @param vocalisation
     * @param lifeSpan
     * @param weight
     * @param vetstreetUrl
     * @param hairless
     * @param rex
     * @param indoor
     * @param affectionLevel
     * @param adaptability
     * @param id
     * @param healthIssues
     * @param rare
     * @param description
     * @param socialNeeds
     * @param name
     * @param vcahospitalsUrl
     * @param lap
     * @param intelligence
     * @param sheddingLevel
     * @param shortLegs
     * @param countryCode
     * @param childFriendly
     * @param origin
     * @param experimental
     * @param suppressedTail
     * @param hypoallergenic
     * @param altNames
     * @param dogFriendly
     * @param countryCodes
     * @param temperament
     * @param energyLevel
     * @param wikipediaUrl
     * @param cfaUrl
     * @param strangerFriendly
     * @param natural
     */
    public AllCatBreedsResponseModel(Integer adaptability, Integer affectionLevel, String altNames, String cfaUrl, Integer childFriendly, String countryCode, String countryCodes, String description, Integer dogFriendly, Integer energyLevel, Integer experimental, Integer grooming, Integer hairless, Integer healthIssues, Integer hypoallergenic, String id, Integer indoor, Integer intelligence, Integer lap, String lifeSpan, String name, Integer natural, String origin, Integer rare, Integer rex, Integer sheddingLevel, Integer shortLegs, Integer socialNeeds, Integer strangerFriendly, Integer suppressedTail, String temperament, String vcahospitalsUrl, String vetstreetUrl, Integer vocalisation, Weight weight, String wikipediaUrl) {
        super();
        this.adaptability = adaptability;
        this.affectionLevel = affectionLevel;
        this.altNames = altNames;
        this.cfaUrl = cfaUrl;
        this.childFriendly = childFriendly;
        this.countryCode = countryCode;
        this.countryCodes = countryCodes;
        this.description = description;
        this.dogFriendly = dogFriendly;
        this.energyLevel = energyLevel;
        this.experimental = experimental;
        this.grooming = grooming;
        this.hairless = hairless;
        this.healthIssues = healthIssues;
        this.hypoallergenic = hypoallergenic;
        this.id = id;
        this.indoor = indoor;
        this.intelligence = intelligence;
        this.lap = lap;
        this.lifeSpan = lifeSpan;
        this.name = name;
        this.natural = natural;
        this.origin = origin;
        this.rare = rare;
        this.rex = rex;
        this.sheddingLevel = sheddingLevel;
        this.shortLegs = shortLegs;
        this.socialNeeds = socialNeeds;
        this.strangerFriendly = strangerFriendly;
        this.suppressedTail = suppressedTail;
        this.temperament = temperament;
        this.vcahospitalsUrl = vcahospitalsUrl;
        this.vetstreetUrl = vetstreetUrl;
        this.vocalisation = vocalisation;
        this.weight = weight;
        this.wikipediaUrl = wikipediaUrl;
    }

    public Integer getAdaptability() {
        return adaptability;
    }

    public void setAdaptability(Integer adaptability) {
        this.adaptability = adaptability;
    }

    public Integer getAffectionLevel() {
        return affectionLevel;
    }

    public void setAffectionLevel(Integer affectionLevel) {
        this.affectionLevel = affectionLevel;
    }

    public String getAltNames() {
        return altNames;
    }

    public void setAltNames(String altNames) {
        this.altNames = altNames;
    }

    public String getCfaUrl() {
        return cfaUrl;
    }

    public void setCfaUrl(String cfaUrl) {
        this.cfaUrl = cfaUrl;
    }

    public Integer getChildFriendly() {
        return childFriendly;
    }

    public void setChildFriendly(Integer childFriendly) {
        this.childFriendly = childFriendly;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(String countryCodes) {
        this.countryCodes = countryCodes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDogFriendly() {
        return dogFriendly;
    }

    public void setDogFriendly(Integer dogFriendly) {
        this.dogFriendly = dogFriendly;
    }

    public Integer getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(Integer energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Integer getExperimental() {
        return experimental;
    }

    public void setExperimental(Integer experimental) {
        this.experimental = experimental;
    }

    public Integer getGrooming() {
        return grooming;
    }

    public void setGrooming(Integer grooming) {
        this.grooming = grooming;
    }

    public Integer getHairless() {
        return hairless;
    }

    public void setHairless(Integer hairless) {
        this.hairless = hairless;
    }

    public Integer getHealthIssues() {
        return healthIssues;
    }

    public void setHealthIssues(Integer healthIssues) {
        this.healthIssues = healthIssues;
    }

    public Integer getHypoallergenic() {
        return hypoallergenic;
    }

    public void setHypoallergenic(Integer hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIndoor() {
        return indoor;
    }

    public void setIndoor(Integer indoor) {
        this.indoor = indoor;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getLap() {
        return lap;
    }

    public void setLap(Integer lap) {
        this.lap = lap;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNatural() {
        return natural;
    }

    public void setNatural(Integer natural) {
        this.natural = natural;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getRare() {
        return rare;
    }

    public void setRare(Integer rare) {
        this.rare = rare;
    }

    public Integer getRex() {
        return rex;
    }

    public void setRex(Integer rex) {
        this.rex = rex;
    }

    public Integer getSheddingLevel() {
        return sheddingLevel;
    }

    public void setSheddingLevel(Integer sheddingLevel) {
        this.sheddingLevel = sheddingLevel;
    }

    public Integer getShortLegs() {
        return shortLegs;
    }

    public void setShortLegs(Integer shortLegs) {
        this.shortLegs = shortLegs;
    }

    public Integer getSocialNeeds() {
        return socialNeeds;
    }

    public void setSocialNeeds(Integer socialNeeds) {
        this.socialNeeds = socialNeeds;
    }

    public Integer getStrangerFriendly() {
        return strangerFriendly;
    }

    public void setStrangerFriendly(Integer strangerFriendly) {
        this.strangerFriendly = strangerFriendly;
    }

    public Integer getSuppressedTail() {
        return suppressedTail;
    }

    public void setSuppressedTail(Integer suppressedTail) {
        this.suppressedTail = suppressedTail;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public String getVcahospitalsUrl() {
        return vcahospitalsUrl;
    }

    public void setVcahospitalsUrl(String vcahospitalsUrl) {
        this.vcahospitalsUrl = vcahospitalsUrl;
    }

    public String getVetstreetUrl() {
        return vetstreetUrl;
    }

    public void setVetstreetUrl(String vetstreetUrl) {
        this.vetstreetUrl = vetstreetUrl;
    }

    public Integer getVocalisation() {
        return vocalisation;
    }

    public void setVocalisation(Integer vocalisation) {
        this.vocalisation = vocalisation;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public String getWikipediaUrl() {
        return wikipediaUrl;
    }

    public void setWikipediaUrl(String wikipediaUrl) {
        this.wikipediaUrl = wikipediaUrl;
    }

}