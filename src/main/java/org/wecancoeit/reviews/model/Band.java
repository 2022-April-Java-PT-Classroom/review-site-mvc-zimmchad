package org.wecancoeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bandName;
    private String category;
    private String bandUrl;

    public Band(Long id, String bandName, String category, String bandUrl){
        this.id=id;
        this.bandName=bandName;
        this.category=category;
        this.bandUrl=bandUrl;
    }

    public void Band(){

    }

    public Long getId() {
        return id;
    }

    public String getBandName(){
        return bandName;
    }

    public String getCategory(){
        return category;
    }

    public String getBandUrl(){
        return bandUrl;
    }

    @Override
    public String toString(){
        return "Band{" +
                "id=" +
                ", band name='" + bandName +
                ", category='" + category + '/' +
                '}';
    }

}
