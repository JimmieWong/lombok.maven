package lombok.pg;

import lombok.EnumId;
import lombok.RequiredArgsConstructor;
import lombok.Getter;

public class EnumIdExample {
  @RequiredArgsConstructor
  public enum Status {
    WAITING(0),
    READY(1),
    SKIPPED(-1),
    COMPLETED(5);
   
    @EnumId
    @Getter
    private final int code;
  }
}
