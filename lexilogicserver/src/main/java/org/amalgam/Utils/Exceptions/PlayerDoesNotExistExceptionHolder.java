package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/PlayerDoesNotExistExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 13, 2024 11:20:50 PM SGT
*/

public final class PlayerDoesNotExistExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public PlayerDoesNotExistException value = null;

  public PlayerDoesNotExistExceptionHolder ()
  {
  }

  public PlayerDoesNotExistExceptionHolder (PlayerDoesNotExistException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PlayerDoesNotExistExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PlayerDoesNotExistExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PlayerDoesNotExistExceptionHelper.type ();
  }

}
