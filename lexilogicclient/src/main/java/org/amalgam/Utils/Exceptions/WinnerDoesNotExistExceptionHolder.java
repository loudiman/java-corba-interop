package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/WinnerDoesNotExistExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, June 30, 2024 9:48:44 PM SGT
*/

public final class WinnerDoesNotExistExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public WinnerDoesNotExistException value = null;

  public WinnerDoesNotExistExceptionHolder ()
  {
  }

  public WinnerDoesNotExistExceptionHolder (WinnerDoesNotExistException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = WinnerDoesNotExistExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    WinnerDoesNotExistExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return WinnerDoesNotExistExceptionHelper.type ();
  }

}
