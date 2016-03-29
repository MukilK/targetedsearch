package com.targetedsearch.core;

import java.util.List;

import com.targetedsearch.core.api.IPost;

public class JobPost implements IPost {

  Location location;
  Salary Salary;
  boolean isRemote;
  Poster employer;
  List<MatchAttribute> skillSets;
  String description;
  JobType type;
  boolean isSecurityClearanceRequired;
  
  

}
