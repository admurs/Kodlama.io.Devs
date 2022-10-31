package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concrete.Language;

public interface LanguageRepository {

	List<Language> getAll();
	
	Language getId(int id);
	
	void add(Language language);
	
	void update(Language language);
	
	void delete(int id);
}
