package org.mhromyk.atm;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CommandRouter_Factory implements Factory<CommandRouter> {
  @Override
  public CommandRouter get() {
    return newInstance();
  }

  public static CommandRouter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CommandRouter newInstance() {
    return new CommandRouter();
  }

  private static final class InstanceHolder {
    private static final CommandRouter_Factory INSTANCE = new CommandRouter_Factory();
  }
}
