package com.codingdojo.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.demo.models.Language;

public interface LanguagesRepository extends CrudRepository<Language, Long>{
	List<Language> findAll();
}