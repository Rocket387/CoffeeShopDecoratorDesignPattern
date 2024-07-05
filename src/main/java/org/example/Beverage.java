package org.example;

/**
 * Hello world!
 *
 */
public abstract class Beverage
{
    public static final String TALL = "Tall";
    public static final String GRANDE = "Grande";
    public static final String VENTI = "Venti";
    String description =  "Unknown Beverage";

    String size;

    public String getSize(){
        return size;
    }
    public void setSize(String size){
        if(size.equals(TALL) || size.equals(GRANDE) || size.equals(VENTI)) {
            this.size = size;
        }
    }
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
