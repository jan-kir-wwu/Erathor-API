package org.erathor.api.controller;

import org.erathor.api.model.IExecution;

import java.util.List;
import java.util.Optional;

public interface IExecutionController<I extends IExecution> {

    public I get(Integer id);

    public Optional<I> read(Integer id);

    public void add(I model);

    // public void remove(I model);

    public void create(I model);

    public void update(I model);

    public void delete(I model);

    public List<I> readAll();
}
