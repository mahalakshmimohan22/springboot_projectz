package com.maha.CrudProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.maha.CrudProject.model.*;
import com.maha.CrudProject.repository.Repository;

@Service
public class Services {
        @Autowired
        Repository rp;
        public Model saveInformation(Model md)
        {
        	return rp.save(md);
        }
        public List<Model> storeInformation(List<Model> md)
        {
        	return (List<Model>) rp.saveAll(md);
        }
        public List<Model> showInformation()
        {
        	return rp.findAll();
        }
        public Model updateInformation(Model md)
        {
        	return rp.saveAndFlush(md);
        }
        public void deleteInformation(Model md)
        {
        	rp.delete(md);
        }
        public Optional<Model> showInformationById(int Id)
        {
        	return rp.findById(Id);
        }
        public String updateInformationById(int Id, Model md)
        {
        	rp.saveAndFlush(md);
        	if(rp.existsById(Id))
        	{
        		return("Values are Updated successfully !!!");
        	}
        	else
        	{
        		return("Enter valid user Id");
        	}
        }
        public void deleteInformationById(int Id)
        {
        	rp.deleteById(Id);
        }
}
