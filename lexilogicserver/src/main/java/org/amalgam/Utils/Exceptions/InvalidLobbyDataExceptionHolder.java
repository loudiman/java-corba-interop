package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/InvalidLobbyDataExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Thursday, May 9, 2024 1:16:39 PM SGT
*/

public final class InvalidLobbyDataExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public InvalidLobbyDataException value = null;

  public InvalidLobbyDataExceptionHolder ()
  {
  }

  public InvalidLobbyDataExceptionHolder (InvalidLobbyDataException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InvalidLobbyDataExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InvalidLobbyDataExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InvalidLobbyDataExceptionHelper.type ();
  }

}
