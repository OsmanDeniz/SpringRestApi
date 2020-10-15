package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.DataAccessLayer.ILanguageDAL;
import com.deniz.sakilamysql.Entities.Language;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class LanguageDal_Hibernate implements ILanguageDAL {

    private EntityManager entityManager;
    @Autowired
    public LanguageDal_Hibernate(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(Language language) {
        Session session = this.entityManager.unwrap(Session.class);
        session.save(language);
    }

    @Override
    public void update(Language language) {
        Session session = this.entityManager.unwrap(Session.class);
        session.update(language);
    }

    @Override
    public void delete(Language language) {
        Session session = this.entityManager.unwrap(Session.class);
        Language languageToDelete = session.get(Language.class,language.getLanguage_id());
        session.delete(languageToDelete);
    }

    @Override
    public List<Language> getAll() {
        Session session = this.entityManager.unwrap(Session.class);
        List<Language> languageList = session.createQuery("from Language ",Language.class).getResultList();
        return languageList;
    }

    @Override
    public Language getById(int language_id) {
        Session session = this.entityManager.unwrap(Session.class);
        Language language = session.get(Language.class,language_id);
        return language;
    }
}
