package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/InvalidPlayerDataExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 2:06:55 AM SGT
*/

public final class InvalidPlayerDataExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Utils.Exceptions.InvalidPlayerDataException value = null;

  public InvalidPlayerDataExceptionHolder ()
  {
  }

  public InvalidPlayerDataExceptionHolder (org.amalgam.Utils.Exceptions.InvalidPlayerDataException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Utils.Exceptions.InvalidPlayerDataExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Utils.Exceptions.InvalidPlayerDataExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Utils.Exceptions.InvalidPlayerDataExceptionHelper.type ();
  }

}
