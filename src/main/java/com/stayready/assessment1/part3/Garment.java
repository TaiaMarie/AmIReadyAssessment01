package com.stayready.assessment1.part3;

/**
 *
 *  Uncomment `src/test/java/com.stayready.assessment1/part3/GarmentTest`
 *  and make sure all the test in the class pass.
 *
 *  Garment is an abstract class. It implements Product.
 */
public class Garment {
     Double price;
     String size;


    /**
     * CONSTRUCTORS
     *
     * There should be three constructors:
     * 1. An empty constructor that does not take in any argument.
     *    In this constructor, initialize price to 0 and
     *    size to "Universal".
     *
     * 2. A constructor that takes the price and set it to the price field.
     *    Set the size to "Universal".
     *
     * 3. A constructor that takes two fields double price and String size.
     */
    public void construct()
    {
        price = 0.0;
        size = "Universal";

    }
    public void Price(Double price)
    {
        this.price = price;
    }
    public void Size(String size)
    {
        this.size = size;
    }
    public void both(Double price, String size)
    {
        this.price = price;
        this.size = size;
    }


    /**
     * METHODS
     *
     * 1. Create a getter method called "getPrice" to return the price.
     *    The return type is double.
     *
     * 2.Create a getter method called "getSize" which return the size.
     *    The return type is String.
     */
    public Double getPrice()
    {
        return this.price; 
    }
    public String getSize()
    {
        return this.size;
    }
}