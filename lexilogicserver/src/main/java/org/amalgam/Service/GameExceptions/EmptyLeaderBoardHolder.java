package org.amalgam.Service.GameExceptions;

/**
* org/amalgam/Service/GameExceptions/EmptyLeaderBoardHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Friday, May 3, 2024 11:29:37 PM SGT
*/

public final class EmptyLeaderBoardHolder implements org.omg.CORBA.portable.Streamable
{
  public EmptyLeaderBoard value = null;

  public EmptyLeaderBoardHolder ()
  {
  }

  public EmptyLeaderBoardHolder (EmptyLeaderBoard initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EmptyLeaderBoardHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EmptyLeaderBoardHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EmptyLeaderBoardHelper.type ();
  }

}
