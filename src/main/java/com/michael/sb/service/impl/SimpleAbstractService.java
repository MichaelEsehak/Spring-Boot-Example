/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.michael.sb.service.impl;

import com.michael.sb.entity.AbstractEntity;
import com.michael.sb.repo.AbstractRepo;
import com.michael.sb.service.AbstractService;

/**
 *
 * @author Michael
 */
public abstract class SimpleAbstractService<T extends AbstractEntity> implements AbstractService<T> {

    public abstract AbstractRepo<T> getRepo();

    @Override
    public Iterable<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public void save(T u) {
        getRepo().save(u);

    }

     @Override
    public T findById(Integer id) {
        return getRepo().getOne(id);
    }

    public void printAll(String s) {
        getRepo().printAll(s);
    }
}
