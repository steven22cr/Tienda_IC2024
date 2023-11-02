package com.tienda.controller;
import com.tienda.CategoriaService.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;






@Controller
@RequestMapping("/producto")
public class productoController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/producto")
    public String listado(Model model){
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalCategorias", categorias.size());
        return "/categoria/listado";
        
    }
    @GetMapping("/productos")
    public String productos(Model model){
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalCategorias", categorias.size());
        return "/categoria/listado";
        
    }
    
}