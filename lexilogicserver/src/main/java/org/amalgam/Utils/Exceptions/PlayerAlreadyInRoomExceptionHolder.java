package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/PlayerAlreadyInRoomExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, 26 May 2024 00:11:51 o'clock PST
*/

public final class PlayerAlreadyInRoomExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public PlayerAlreadyInRoomException value = null;

  public PlayerAlreadyInRoomExceptionHolder ()
  {
  }

  public PlayerAlreadyInRoomExceptionHolder (PlayerAlreadyInRoomException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PlayerAlreadyInRoomExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PlayerAlreadyInRoomExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PlayerAlreadyInRoomExceptionHelper.type ();
  }

}
