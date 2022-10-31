package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.entities.concrete.Language;

@RestController
@RequestMapping("/api/Languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@GetMapping("/getAll")
	@Operation(summary = "Tüm Dilleri Getirir", tags = "Spring List Çalışması")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	@GetMapping("/getId")
	@Operation(summary = "ID'ye Göre Tek Bir Dil Getirir", tags = "Spring ID List Çalışması")
	public Language getId( int id) {
		return languageService.getId(id);
	}
	@PostMapping("/add")
	@Operation(summary = "Ekleme Yapar", tags = "Spring Add Çalışması")
	public void add(Language language) throws Exception {
		languageService.add(language);
	}
	@PutMapping("/update")
	@Operation(summary = "Güncelleme Yapar", tags = "Spring Update Çalışması")
	public void update(Language language) throws Exception {
		languageService.update(language);
	}
	@DeleteMapping("/delete")
	@Operation(summary = "Silme Yapar", tags = "Spring Delete Çalışması")
	public void delete(int id) throws Exception {
		languageService.delete(id);
	}
}
