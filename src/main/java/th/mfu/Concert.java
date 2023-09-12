package th.mfu;

import java.util.Date;

public class Concert {

    //TODO: add attributes
    String title, performer, description;
    int id;
    Date date;

    public Concert() {
    }
    public Concert(String title,String description) {
        //TODO: set attributes
        title = this.title;
        description = this.description;
    }

    public void setId(int id){
        id = this.id;
    }

    public int getId(){
        return id;
    }
 
    public String getTitle() {
        //TODO: return title
        return title;
    }

    public void setPerformer(String performer){
        performer = this.performer;
    }

    public String getPerformer(){
        return performer;
    }

    public void setDate(Date date){
        date = this.date;
    }

    public Date getDate(){
        return date;
    }

    public String getDescription() {
        //TODO: return description
        return description;
    }

    //TODO: add getters and setters

}