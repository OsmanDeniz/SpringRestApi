package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.DataAccessLayer.ILanguageDAL;
import com.deniz.sakilamysql.Entities.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class LanguageManager implements ILanguageService {

    private ILanguageDAL languageDAL;
    @Autowired
    public LanguageManager(ILanguageDAL languageDAL) {
        this.languageDAL = languageDAL;
    }

    @Override
    @Transactional
    public void add(Language language) {
        this.languageDAL.add(language);
    }

    @Override
    @Transactional
    public void update(Language language) {
        this.languageDAL.update(language);
    }

    @Override
    @Transactional
    public void delete(Language language) {
        this.languageDAL.delete(language);
    }

    @Override
    @Transactional
    public List<Language> getAll() {
        return this.languageDAL.getAll();
    }

    @Override
    @Transactional
    public Language getById(int language_id) {
        return this.languageDAL.getById(language_id);
    }
}
