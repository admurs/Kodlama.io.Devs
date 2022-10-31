package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concrete.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{
	
	ArrayList<Language> languages;
	
	public  InMemoryLanguageRepository() {
		languages=new ArrayList<Language>();
		languages.add(new Language(1,"JAVA"));
		languages.add(new Language(2,"C#"));
		languages.add(new Language(3,"PYTHON"));
		languages.add(new Language(4,"JAVASCRIPT"));
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public Language getId(int id) {
		for (Language language : languages) {
			if (language.getId()==id) {
				return language;
			}
		}
		
		return null;
	}

	@Override
	public void add(Language language) {
		languages.add(language);
		
	}

	@Override
	public void update(Language language) {
		for (Language lang : languages) {
			if (language.getId()==lang.getId()) {
				lang.setName(language.getName());
			}
		}
		
	}

	@Override
	public void delete(int id) {
		languages.remove(id);
		
	}

}
