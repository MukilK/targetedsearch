package com.targetedsearch;


public class MatchAttribute {

  private int weight;
  private int score;
  private String description;
  private int id;
  
  
  public int getWeight() {
    return weight;
  }
  public void setWeight(int weight) throws Exception {
   if(weight<0 || weight>100 ){
     throw new Exception("The weight should be between 0 & 100.");
   }
    this.weight = weight;
  }
  public int getScore() {
    return score;
  }
  public void setScore(int score) throws Exception {
    if (score<0 || score>10){
      throw new Exception("The score should be between 0 & 10.");
    }
    this.score = score;
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
