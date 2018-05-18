/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe5Lambda;

/**
 *
 * @author Flow-User
 */
public class KindleEdition {
    private String Title;
    private double Price;
    private int Page_Count;
    public KindleEdition(String Title,double Price,int Page_Count)
    {
        this.Title=Title;
        this.Price=Price;
        this.Page_Count=Page_Count;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getPage_Count() {
        return Page_Count;
    }

    public void setPage_Count(int Page_Count) {
        this.Page_Count = Page_Count;
    }
    
   
    @Override

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(Title).append(" : ").append(Price);

          

        return sb.toString();

    }
    
    
    
}
