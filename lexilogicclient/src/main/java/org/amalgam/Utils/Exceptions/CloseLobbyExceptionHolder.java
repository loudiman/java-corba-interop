package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/CloseLobbyExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, June 30, 2024 9:48:44 PM SGT
*/

public final class CloseLobbyExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public CloseLobbyException value = null;

  public CloseLobbyExceptionHolder ()
  {
  }

  public CloseLobbyExceptionHolder (CloseLobbyException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CloseLobbyExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CloseLobbyExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CloseLobbyExceptionHelper.type ();
  }

}
