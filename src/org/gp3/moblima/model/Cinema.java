package org.gp3.moblima.model;

/**
 * Created by Shen Youlin on 15/10/17.
 */

public class Cinema extends Model
{
    private String name;
    private boolean isPlatinum;


    public Cinema(String name, boolean isPlatinum) {
        this.name = name;
        this.isPlatinum = isPlatinum;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPlatinum() {
        return isPlatinum;
    }

    public void setPlatinum(boolean platinum) {
        isPlatinum = platinum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cinema) {
            Cinema t = (Cinema) obj;
            return (t.name == name && t.isPlatinum == isPlatinum);
        }
        return super.equals(obj);
    }
}
