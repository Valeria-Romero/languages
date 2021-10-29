package com.codingdojo.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.demo.models.Language;
import com.codingdojo.demo.repositories.LanguagesRepository;

@Service
public class LanguagesService {
	private final LanguagesRepository langRepo;
	public LanguagesService(LanguagesRepository repo) {
		langRepo = repo;
	}
	
	public List<Language> allLanguages() {
		return langRepo.findAll();
	}
	
	public Language findLanguage(Long id) {
		return langRepo.findById(id).orElse(null);
	}
	public Language createLanguage(Language lang) {
		return langRepo.save(lang);
	}
	
	public Language updateLanguage(Language lang) {
		return langRepo.save(lang);
	}
	
	public void deleteLanguage(Long id) {
		langRepo.deleteById(id);
	}
}