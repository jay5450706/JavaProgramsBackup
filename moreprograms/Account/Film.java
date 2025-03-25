/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author user
 */
public class Film extends Video{
    
    private String type;
    private String star;
    
    public Film(String name, double duration, String type, String star){
       super(name,duration);
       this.type = type;
       this.star = star;
    }

    @Override
    public String toString() {
        return "Film{" + "type=" + type + ", star=" + star + ", name=" + name + ", duration=" + duration + '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }
    
    
    
    
}
