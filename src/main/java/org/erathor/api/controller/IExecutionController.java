package org.erathor.api.controller;

import org.erathor.api.model.IExecution;
import org.erathor.api.model.IModel;

import java.util.List;
import java.util.Optional;

public interface IExecutionController {

    public Optional<IExecution> read(Integer id);

    public void create(IExecution model);

    public void update(IExecution model);

    public void delete(IExecution model);

    public List<IExecution> readAll();
}
