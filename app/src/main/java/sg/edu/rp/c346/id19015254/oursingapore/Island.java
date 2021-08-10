package sg.edu.rp.c346.id19015254.oursingapore;

import java.io.Serializable;

public class Island implements Serializable {

    private int id;
    private String name;
    private String desc;
    private int area;
    private float stars;

    public Island(String name, String desc, int area, float stars) {
        this.name = name;
        this.desc = desc;
        this.area = area;
        this.stars = stars;
    }

    public Island(int id, String name, String desc, int area, float stars) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.area = area;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public Island setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Island setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Island setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public int getArea() {
        return area;
    }

    public Island setArea(int area) {
        this.area = area;
        return this;
    }

    public float getStars() {
        return stars;
    }

    public Island setStars(float stars) {
        this.stars = stars;
        return this;
    }

    @Override
    public String toString() {
        String starsString = "";
      /*  if (stars == 5){
            starsString = "*****";
        } else if (stars == 4){
            starsString = "****";
        }*/

        //or
        for(int i = 0; i < stars; i++){
            starsString += "*";
        }
        return starsString;

    }
}
