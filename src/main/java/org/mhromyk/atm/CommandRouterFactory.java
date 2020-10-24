package org.mhromyk.atm;

import dagger.Component;

@Component
public interface CommandRouterFactory {

    CommandRouter router();
}
