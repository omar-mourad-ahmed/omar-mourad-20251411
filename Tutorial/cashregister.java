/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sheet6.tutorial;

/**
 *
 * @author Student
 */
class cashregister {
        
    private int itemcount;
    
     private double totalprice;
    
    public cashregister(){
    
    itemcount=0;
    
    totalprice=0;
    
    }
    
     public cashregister(int itemcount,double totalprice){
     
     this.itemcount = itemcount;
     
     this.totalprice = totalprice;
     
     }
    
    
    public void additem( double price){
    
    itemcount++;
    
    totalprice += price;
    }
    
    public void clear (){
    
    itemcount=0;
    
    totalprice=0.0;
    }
    
    public int getitemcount(){
    
    return itemcount;
    
    }
    
    
    public double gettotalprice(){
    
    return totalprice;
    }
    
    
}
