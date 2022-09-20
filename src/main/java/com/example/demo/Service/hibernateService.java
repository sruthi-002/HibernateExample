package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.hibernateRepo;
import com.example.demo.model.hibernate;
@Service
public class hibernateService {
	@Autowired
	hibernateRepo repo;
	public List<hibernate> listAll() {
	        return repo.findAll();
	    }
}
