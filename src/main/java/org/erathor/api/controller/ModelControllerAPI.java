package org.erathor.api.controller;

import java.util.List;
import java.util.Optional;

import org.erathor.api.model.ModelAPI;

public interface ModelControllerAPI<M extends ModelAPI> {

    public Optional<M> read(Integer id);

    public M create(M model);

    public void update(M model);

    public void delete(M model);

    public List<M> readAll();

}
