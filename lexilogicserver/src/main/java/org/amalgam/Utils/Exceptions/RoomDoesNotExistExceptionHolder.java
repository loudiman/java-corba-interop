package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/RoomDoesNotExistExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, 26 May 2024 00:11:51 o'clock PST
*/

public final class RoomDoesNotExistExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public RoomDoesNotExistException value = null;

  public RoomDoesNotExistExceptionHolder ()
  {
  }

  public RoomDoesNotExistExceptionHolder (RoomDoesNotExistException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RoomDoesNotExistExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RoomDoesNotExistExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RoomDoesNotExistExceptionHelper.type ();
  }

}
