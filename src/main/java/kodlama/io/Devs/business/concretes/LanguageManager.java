package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concrete.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {

		return languageRepository.getAll();
	}

	@Override
	public Language getId(int id) {

		return languageRepository.getId(id);
	}

	@Override
	public void add(Language language) throws Exception {
		List<Language> languages = languageRepository.getAll();
		for (Language lang : languages) {
			if (lang.getName().equals("") || lang.getId() == language.getId()) {
				throw new Exception("Aynı isim veya Boş girilemez.");
			}
		}
		languageRepository.add(language);
	}

	@Override
	public void update(Language language) {
		languageRepository.update(language);

	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);

	}

}
