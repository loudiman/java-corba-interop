package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/EmptyLeaderBoardExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, 26 May 2024 00:11:52 o'clock PST
*/

public final class EmptyLeaderBoardExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public EmptyLeaderBoardException value = null;

  public EmptyLeaderBoardExceptionHolder ()
  {
  }

  public EmptyLeaderBoardExceptionHolder (EmptyLeaderBoardException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EmptyLeaderBoardExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EmptyLeaderBoardExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EmptyLeaderBoardExceptionHelper.type ();
  }

}
