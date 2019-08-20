package info.camposha.firebasesearch;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class Scientist  implements Serializable {

    private String mId,name,description,galaxy,star,dob,dod,key;

    public Scientist() {
        //empty constructor needed
    }
    public Scientist(String name,String description,String galaxy,String star, String dob,
                String dod ) {
        if (name.trim().equals("")) {
            name = "Scientist NoName";
        }
        this.name = name;
        this.description = description;
        this.galaxy = galaxy;
        this.star = star;
        this.dob = dob;
        this.dod = dod;
    }


    public String getId() {
        return mId;
    }
    public void setId(String id) {
        mId = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getGalaxy() {
        return galaxy;
    }
    public void setGalaxy(String galaxy) {
        this.galaxy = galaxy;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDod() {
        return dod;
    }

    public void setDod(String dod) {
        this.dod = dod;
    }

    @Override
    public String toString() {
        return getName();
    }
    @Exclude
    public String getKey() {
        return key;
    }
    @Exclude
    public void setKey(String key) {
        this.key = key;
    }
}
//end
