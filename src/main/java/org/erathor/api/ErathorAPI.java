package org.erathor.api;

import org.erathor.api.controller.IErathorControllers;

public interface ErathorAPI {
    // This is the interface that the ErathorCore plugin implements.

    IErathorControllers getControllers();

}
