package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/GameResultUnavailableExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 20, 2024 3:01:31 PM PST
*/

public final class GameResultUnavailableExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public GameResultUnavailableException value = null;

  public GameResultUnavailableExceptionHolder ()
  {
  }

  public GameResultUnavailableExceptionHolder (GameResultUnavailableException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = GameResultUnavailableExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    GameResultUnavailableExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return GameResultUnavailableExceptionHelper.type ();
  }

}
