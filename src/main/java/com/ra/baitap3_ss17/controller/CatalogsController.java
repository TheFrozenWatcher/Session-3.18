package com.ra.baitap3_ss17.controller;

import com.ra.baitap3_ss17.Model.Category;
import com.ra.baitap3_ss17.service.CatalogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class CatalogsController {
    @Autowired
    CatalogsService catalogsService;
@GetMapping("/catalogs")
    public String catalogs(Model model) {
    model.addAttribute("listCatalogs",catalogsService.getCatalogs());
    return "catalogs";
}
    @GetMapping("/delete/{id}")
    public String delete( Model model, @PathVariable String id) {
    catalogsService.deleteCatalog(Integer.parseInt(id));
        model.addAttribute("listCatalogs",catalogsService.getCatalogs());
    return "catalogs";
    }
@GetMapping("/addCatalogs")
    public String addCatalogs( Model model) {

    model.addAttribute("category",new Category());
    return "addCatalogs";
}
@PostMapping("/addCatalog")
    public String addCatalog(@ModelAttribute Category category) {
    catalogsService.addCatalog(category);
    return "catalogs";
}
}
