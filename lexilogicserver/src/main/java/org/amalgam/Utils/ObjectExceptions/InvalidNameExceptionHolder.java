package org.amalgam.Utils.ObjectExceptions;

/**
* org/amalgam/Utils/ObjectExceptions/InvalidNameExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramObjects.idl
* Friday, May 3, 2024 11:32:16 PM SGT
*/

public final class InvalidNameExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public InvalidNameException value = null;

  public InvalidNameExceptionHolder ()
  {
  }

  public InvalidNameExceptionHolder (InvalidNameException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InvalidNameExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InvalidNameExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InvalidNameExceptionHelper.type ();
  }

}
