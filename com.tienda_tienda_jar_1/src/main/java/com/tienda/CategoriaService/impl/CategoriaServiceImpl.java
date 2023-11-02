/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.CategoriaService.impl;

import com.tienda.CategoriaService.CategoriaService;
import com.tienda.dao.CategoriaDao;
import com.tienda.domain.categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<categoria> getCategorias(boolean activo) {
        var categorias = categoriaDao.findAll();
        return categorias;
    }

}
