package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/AlreadyLoggedInExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 12:45:43 AM SGT
*/

public final class AlreadyLoggedInExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public AlreadyLoggedInException value = null;

  public AlreadyLoggedInExceptionHolder ()
  {
  }

  public AlreadyLoggedInExceptionHolder (AlreadyLoggedInException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlreadyLoggedInExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlreadyLoggedInExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlreadyLoggedInExceptionHelper.type ();
  }

}
