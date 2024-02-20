package com.springrest.springrest.services;

	

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.home;
import com.springrest.springrest.homedao.HomeDao;
@Service
public class ServiceImpl implements LoadServices {
	@Autowired
	private HomeDao homedao;
	
 
	@Override
	

	public String addLoad(home load) {
		homedao.save(load);
       return "loads details added successfully ";
	}

	@Override
	public List<home> listgetbyId(String id) {
             return homedao.findByShipperId(id);
	}

	@Override
	public home getbyId(int id) {
		Optional<home> o=homedao.findById(id);
		if(o.get()==null) {
			return null;
		}
		return o.get();
	}

	@Override
	public String updatebyId(home load,int id) {
     home l = homedao.findById(id).orElse(null);
   if (l == null) {
       return "Load Not Found";
   }
   l.setLoadingPoint(load.getLoadingPoint());
   l.setUnloadingPoint(load.getUnloadingPoint());
   l.setProductType(load.getProductType());
   l.setTruckType(load.getTruckType());
   l.setNoOfTrucks(load.getNoOfTrucks());
   l.setWeight(load.getWeight());
//   l.setComment(load.getComment());
   l.setDate(load.getDate());
   homedao.save(l);
   return "Load Updated";		
	}
	
   @Override
   public String deleteById(int loadId){
       home l=homedao.findById(loadId).orElse(null);
       if(l==null){
           return "Load Not Found";
       }
       homedao.delete(l);
       return "Load Deleted";
   }
}

   