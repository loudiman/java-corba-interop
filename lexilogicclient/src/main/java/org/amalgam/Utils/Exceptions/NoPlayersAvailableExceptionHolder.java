package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/NoPlayersAvailableExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, 26 May 2024 00:11:52 o'clock PST
*/

public final class NoPlayersAvailableExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public NoPlayersAvailableException value = null;

  public NoPlayersAvailableExceptionHolder ()
  {
  }

  public NoPlayersAvailableExceptionHolder (NoPlayersAvailableException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NoPlayersAvailableExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NoPlayersAvailableExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NoPlayersAvailableExceptionHelper.type ();
  }

}
