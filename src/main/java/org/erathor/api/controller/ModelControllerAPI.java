package org.erathor.api.controller;

import java.util.List;
import java.util.Optional;

public interface ModelControllerAPI<M, ID> {

    public Optional<M> read(ID id);

    public M create(M model);

    public void update(M model);

    public void delete(M model);

    public List<M> readAll();

}
