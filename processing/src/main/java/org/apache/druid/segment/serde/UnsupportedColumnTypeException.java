package org.apache.druid.segment.serde;

import org.apache.druid.java.util.common.StringUtils;

public class UnsupportedColumnTypeException extends RuntimeException
{
  public UnsupportedColumnTypeException(String formatText, Object... arguments)
  {
    super(StringUtils.nonStrictFormat(formatText, arguments));
  }
}
