package com.targetedsearch.core;

import com.targetedsearch.util.ConfigurationPropertyLoader;


public class MatchAttribute {

  private int weight;
  private String description;
  private int id;
  
  
  public int getWeight() {
    
    return weight;
  }
  public void setWeight(int weight) throws Exception {
    int maxAllowedWeight=ConfigurationPropertyLoader.getAsInt("max.weight");
   if(weight<0 || weight>maxAllowedWeight ){
     throw new Exception("The weight should be between 0 & "+maxAllowedWeight+".");
   }
    this.weight = weight;
  }
    
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  
}
