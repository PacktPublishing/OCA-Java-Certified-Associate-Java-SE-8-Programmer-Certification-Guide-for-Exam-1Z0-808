package com.oca;

import com.libraries.Library;

// This is a comment of a single line

/* This is a multiple line comment
   We can have more than one line. */


/**
 * This is a Javadoc comment
 * @author Mercedes Wyss
 * @since version x.y.z
 * @param we declare as many params as a method has
 * @return used in methods that return a value
 */
public class Structure {

    final int CONSTANT = 10;
    String initialized = "Chapter 1";
    double notInitialized;

    public Structure(){
        this.notInitialized = 14.25;
    }

    public Structure(double notInitialized){
        this.notInitialized = notInitialized;
    }

    public String getInitialized(){
        return initialized;
    }

    public void setInitialized(String initialized){
        this.initialized = initialized;
    }

    public double getNotInitialized(){
        return notInitialized;
    }

    public void setNotInitialized(double notInitialized){
        this.notInitialized = notInitialized;
    }

}