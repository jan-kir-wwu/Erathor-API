package org.erathor.api.controller;

import java.util.List;
import java.util.Optional;

import org.erathor.api.model.IModel;

public interface IModelController<M> {

    public Optional<M> read(Integer id);

    public void create(M model);

    public void update(M model);

    public void delete(M model);

    public List<M> readAll();

}
