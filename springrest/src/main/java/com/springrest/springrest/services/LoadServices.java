package com.springrest.springrest.services;



import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.home;

@Service
public interface LoadServices {
  public String addLoad(home load);
  public List<home> listgetbyId(String id);
  public home getbyId(int id);
  public String deleteById(int id);
  public String updatebyId(home load, int id);
}

    

