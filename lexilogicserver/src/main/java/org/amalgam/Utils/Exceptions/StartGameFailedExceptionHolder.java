package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/StartGameFailedExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 2:06:55 AM SGT
*/

public final class StartGameFailedExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Utils.Exceptions.StartGameFailedException value = null;

  public StartGameFailedExceptionHolder ()
  {
  }

  public StartGameFailedExceptionHolder (org.amalgam.Utils.Exceptions.StartGameFailedException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Utils.Exceptions.StartGameFailedExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Utils.Exceptions.StartGameFailedExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Utils.Exceptions.StartGameFailedExceptionHelper.type ();
  }

}
