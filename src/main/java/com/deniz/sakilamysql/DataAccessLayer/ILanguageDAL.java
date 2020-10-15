package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Language;

import java.util.List;

public interface ILanguageDAL {
    void add(Language language);

    void update(Language language);

    void delete(Language language);

    List<Language> getAll();

    Language getById(int language_id);
}
