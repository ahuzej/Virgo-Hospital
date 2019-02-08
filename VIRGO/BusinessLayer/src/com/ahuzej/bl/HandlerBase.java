/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej.bl;

import com.ahuzej.dal.repository.IRepository;
import com.ahuzej.dal.repository.RepositoryFactory;

/**
 *
 * @author Albert
 */
public class HandlerBase {
    final IRepository repository;

    public HandlerBase() {
        this.repository = RepositoryFactory.getRepository();
    }
    
}
