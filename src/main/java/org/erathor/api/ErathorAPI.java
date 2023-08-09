package org.erathor.api;

import org.erathor.api.controller.ErathorControllersAPI;

public interface ErathorAPI {
    // This is the interface that the ErathorCore plugin implements.

    ErathorControllersAPI getControllers();

}
