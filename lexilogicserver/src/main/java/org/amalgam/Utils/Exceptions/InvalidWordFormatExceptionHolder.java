package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/InvalidWordFormatExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, June 30, 2024 9:50:08 PM SGT
*/

public final class InvalidWordFormatExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public InvalidWordFormatException value = null;

  public InvalidWordFormatExceptionHolder ()
  {
  }

  public InvalidWordFormatExceptionHolder (InvalidWordFormatException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InvalidWordFormatExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InvalidWordFormatExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InvalidWordFormatExceptionHelper.type ();
  }

}
