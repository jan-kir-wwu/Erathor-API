package org.erathor.api.controller;

import java.util.List;
import java.util.Optional;

import org.erathor.api.model.IModel;

public interface IModelController {

    public Optional<?> read(Integer id);

    public void create(IModel model);

    public void update(IModel model);

    public void delete(IModel model);

    public List<?> readAll();

}
