package mca.pling.activity;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;

/**
 * Created by nevin on 9/11/15.
 */
@ParseClassName("Events")
public class Events extends ParseObject{
    public Events(){
        //as  a default constructor is NEEDED!
    }

    public String getTitle() {
        return getString("title");
    }

    public void setTitle(String title) {
        put("title", title);
    }
    public String getDetails() {
        return getString("details");
    }

    public void setDetails(String details) {
        put("details", details);
    }
    public ParseFile getIcon() {
        return getParseFile("icon");
    }

    public void setIcon(ParseFile icon) {
        put("icon", icon);
    }

}
