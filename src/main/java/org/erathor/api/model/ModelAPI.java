package org.erathor.api.model;

public interface ModelAPI<M extends ModelAPI<M>> {

    public Integer getId();

    public void setId(Integer id);

    public void updatedValues();
}
