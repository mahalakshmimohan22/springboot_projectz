package com.maha.CrudProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maha.CrudProject.model.Model;
import com.maha.CrudProject.service.Services;

@RestController
public class apiController {
	@Autowired
	Services serve;

	@PostMapping("map")
	public Model save(@RequestBody Model md) {
		return serve.saveInformation(md);
	}

	@PostMapping("mapdetails")
	public List<Model> saveDetails(@RequestBody List<Model> md) {
		return serve.storeInformation(md);
	}

	@GetMapping("display")
	public List<Model> displayDetails() {
		return serve.showInformation();
	}

	@PutMapping("update")
	public Model changeDetails(@RequestBody Model md) {
		return serve.updateInformation(md);
	}

	@DeleteMapping("delete")
	public String delete(@RequestBody Model md) {
		serve.deleteInformation(md);
		return "Deleted Successfully";
	}

	@GetMapping("get/{Id}")
	public Optional<Model> getInformation(@PathVariable int Id) {
		return serve.showInformationById(Id);
	}

	@PutMapping("update/{Id}")
	public String changeById(@PathVariable int Id, @RequestBody Model md) {
		return serve.updateInformationById(Id, md);
	}

	public void deleteById(@PathVariable int Id) {
		serve.deleteInformationById(Id);
	}
}
