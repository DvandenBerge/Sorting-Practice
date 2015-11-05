package sorting;

import java.util.Objects;
//import org.apache.commons.lang-3.builder.CompareToBuilder

/**
 *
 * @author dvandenberge
 */
public class Turkey implements Comparable<Turkey>{

    private String name;
    private int turkeyId;
    private int featherCount;

    public Turkey(String name, int turkeyId, int featherCount) {
        this.name = name;
        this.turkeyId = turkeyId;
        this.featherCount = featherCount;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getTurkeyId() {
        return turkeyId;
    }
    public void setTurkeyId(int turkeyId) {
        this.turkeyId = turkeyId;
    }

    public int getFeatherCount() {
        return featherCount;
    }
    public void setFeatherCount(int featherCount) {
        this.featherCount = featherCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.turkeyId);
        hash = 19 * hash + this.featherCount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turkey other = (Turkey) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.turkeyId, other.turkeyId)) {
            return false;
        }
        if (this.featherCount != other.featherCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Turkey{" + "name=" + name + ", turkeyId=" + turkeyId + ", featherCount=" + featherCount + '}';
    }
    
//    @Override
//    public int compareTo(Turkey t) {
//        return new CompareToBuilder().
//                append(this.name, t.getName()).
//                append(this.turkeyId, t.getTurkeyId()).
//                append(this.featherCount, t.getFeatherCount()).
//                build();
//    }
 
    @Override
    public int compareTo(Turkey t){
        final int BEFORE=1;
        final int EQUAL=0;
        final int AFTER=-1;
        
        if(name.equals(t.getName()) && turkeyId==t.getTurkeyId() && featherCount==t.getFeatherCount()) return EQUAL;
        else if(turkeyId>t.getTurkeyId()) return BEFORE;
        return AFTER;
    }
}
