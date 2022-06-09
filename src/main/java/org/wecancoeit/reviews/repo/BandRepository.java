package org.wecancoeit.reviews.repo;

import org.springframework.stereotype.Repository;
import org.wecancoeit.reviews.model.Band;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class BandRepository {

    HashMap<Long, Band> bandList = new HashMap<>();


    Band bandA = new Band(1L,"Pearl Jam", "HOF", "https://pearljam.com");
    Band bandB = new Band(2L,"Nirvana", "HOF", "https://nirvana.com");
    Band bandC = new Band(3L,"Soundgarden", "HOF", "https://soundgardenworld.com");
    Band bandD = new Band(4L,"Screaming Trees", "One Hit Wonders", "https://en.wikipedia.org/wiki/Screaming_Trees_discography");
    Band bandE = new Band(5L,"Dinosaur Jr.", "One Hit Wonders", "https://dinosaurjr.com");
    Band bandF = new Band(6L,"Mother Love Bone", "Founding Fathers", "https://www.allmusic.com/artist/mother-love-bone/");
    Band bandG = new Band(7L,"Mudhoney", "Founding Fathers", "https://mudhoneyonline.com");
    Band bandH = new Band(8L,"Love Battery", "How were they not famous?", "https://www.eskimo.com/~tracyr/LoveBat.html");
    Band bandI = new Band(9L,"The Gits", "How were they not famous", "www.thegits.com");
    Band bandJ = new Band(10L,"L7", "One Hit Wonders","https://www.facebook.com/L7theband");
    Band bandK = new Band(11L,"Alice in Chains", "HOF", "https://tour.aliceinchains.com");
    Band bandL = new Band(12L,"Hammerbox", "Underground", "https://hammerbox.bandcamp.com");
    Band bandM = new Band(13L,"Supersuckers", "Underground", "https://supersuckers.com");
    Band bandN = new Band(14L,"Seaweed", "Underground", "https://seaweed.bandcamp.com");
    Band bandO = new Band(15L,"Skin Yard", "Underground", "https://skin-yard.com");

    public BandRepository(){
        bandList.put(bandA.getId(), bandA);
        bandList.put(bandB.getId(), bandB);
        bandList.put(bandC.getId(), bandC);
        bandList.put(bandD.getId(), bandD);
        bandList.put(bandE.getId(), bandE);
        bandList.put(bandF.getId(), bandF);
        bandList.put(bandG.getId(), bandG);
        bandList.put(bandH.getId(), bandH);
        bandList.put(bandI.getId(), bandI);
        bandList.put(bandJ.getId(), bandJ);
        bandList.put(bandK.getId(), bandK);
        bandList.put(bandL.getId(), bandL);
        bandList.put(bandM.getId(), bandM);
        bandList.put(bandN.getId(), bandN);
        bandList.put(bandO.getId(), bandO);

    }

    public Band findOne(long id){
        return bandList.get(id);
    }

    public Collection<Band> findAll() {
        return bandList.values();
    }

}
