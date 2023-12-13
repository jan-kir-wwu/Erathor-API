package org.erathor.api.model;

public interface IModel<M extends IModel<M>> {

    public Integer getId();

    public void setId(Integer id);

    public void updatedValues();
}
