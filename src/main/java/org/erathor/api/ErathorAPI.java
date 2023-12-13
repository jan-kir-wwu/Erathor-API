package org.erathor.api;

import org.erathor.api.controller.IErathorControllers;
import org.erathor.api.model.IModelFactory;

public interface ErathorAPI {
    // This is the interface that the ErathorCore plugin implements.

    IErathorControllers getControllers();

    IModelFactory getModelFactory();

}
