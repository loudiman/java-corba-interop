package org.amalgam.Service.GameServiceModule;

/**
* org/amalgam/Service/GameServiceModule/GameServiceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Sunday, June 30, 2024 9:48:43 PM SGT
*/

public final class GameServiceHolder implements org.omg.CORBA.portable.Streamable
{
  public GameService value = null;

  public GameServiceHolder ()
  {
  }

  public GameServiceHolder (GameService initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = GameServiceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    GameServiceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return GameServiceHelper.type ();
  }

}
