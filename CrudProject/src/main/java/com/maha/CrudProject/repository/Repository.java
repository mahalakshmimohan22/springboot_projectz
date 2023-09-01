package com.maha.CrudProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.maha.CrudProject.model.*;
public interface Repository extends JpaRepository<Model, Integer>
{
	
}
