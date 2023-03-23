package model;

public class CancerChernobyl{

    //atributes
    protected Integer year;
    
    protected String sex;
    
    protected String location;

    protected String cancerType;

    protected Float cases;



    //Bean 
    public CancerChernobyl(Integer year, String sex, String location, String cancerType, Float cases) {
        this.year = year;
        this.sex = sex;
        this.location = location;
        this.cancerType = cancerType;
        this.cases = cases;
    }
    
    public CancerChernobyl(){

    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCancerType() {
        return cancerType;
    }

    public void setCancerType(String cancerType) {
        this.cancerType = cancerType;
    }

    public Float getCases() {
        return cases;
    }

    public void setCases(Float cases) {
        this.cases = cases;
    }
    
    @Override
    public String toString() {
        return this.year + "," + this.sex + "," + this.location + "," + this.cancerType + "," + this.cases;
    }
}
