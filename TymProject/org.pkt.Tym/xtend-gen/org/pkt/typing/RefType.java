package org.pkt.typing;

import org.pkt.typing.TymType;

@SuppressWarnings("all")
public class RefType implements TymType {
  @Override
  public String toString() {
    return "reference";
  }
}
