package org.amalgam.Service.GameExceptions;

/**
* org/amalgam/Service/GameExceptions/InvalidRequestExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Friday, May 3, 2024 11:33:52 PM SGT
*/

public final class InvalidRequestExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public InvalidRequestException value = null;

  public InvalidRequestExceptionHolder ()
  {
  }

  public InvalidRequestExceptionHolder (InvalidRequestException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InvalidRequestExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InvalidRequestExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InvalidRequestExceptionHelper.type ();
  }

}
