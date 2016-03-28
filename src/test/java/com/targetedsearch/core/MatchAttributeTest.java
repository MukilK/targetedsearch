package com.targetedsearch.core;

import org.junit.Assert;
import org.junit.Test;

import com.targetedsearch.core.MatchAttribute;

public class MatchAttributeTest {
  
  
  @Test(expected = Exception.class)
  
  public void setNegativeWeightTest() throws Exception{
    
    MatchAttribute matchAttribute= new MatchAttribute();
    matchAttribute.setWeight(-1);
    
  }
  
@Test(expected = Exception.class)
  
  public void setAboveTenWeightTest() throws Exception{
    
    MatchAttribute matchAttribute= new MatchAttribute();
    matchAttribute.setWeight(11);
    
  }

@Test()

public void setRegularWeightTest() throws Exception{
  
  MatchAttribute matchAttribute= new MatchAttribute();
  matchAttribute.setWeight(0);
  Assert.assertEquals(0,matchAttribute.getWeight());
  matchAttribute.setWeight(1);
  Assert.assertEquals(1,matchAttribute.getWeight());
  matchAttribute.setWeight(5);
  Assert.assertEquals(5,matchAttribute.getWeight());
  matchAttribute.setWeight(10);
  Assert.assertEquals(10,matchAttribute.getWeight());
}


}
