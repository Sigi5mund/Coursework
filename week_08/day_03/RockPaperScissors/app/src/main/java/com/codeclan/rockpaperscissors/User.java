package com.codeclan.rockpaperscissors;

/**
 * Created by user on 20/12/2017.
 */

public class User {


    protected String selection;
    public User ( String selection){
        this.selection = selection;
    }

    public String getSelection() {
        return selection;
    }
    public void setSelection(String selection) {
        this.selection = selection;
    }

}
