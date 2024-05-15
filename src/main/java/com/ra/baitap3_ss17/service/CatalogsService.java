package com.ra.baitap3_ss17.service;

import com.ra.baitap3_ss17.Model.Category;
import com.ra.baitap3_ss17.untiy.DaoCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogsService {
    @Autowired
    DaoCatalog daoCatalog;

    public List<Category> getCatalogs() {
        return daoCatalog.getList();
    }
   public void deleteCatalog(int id) {
        daoCatalog.delete(id);
   }
   public void updateCatalog(Category category) {
        daoCatalog.update(category);
   }
   public void addCatalog(Category category) {
        daoCatalog.insert(category);
   }
}
