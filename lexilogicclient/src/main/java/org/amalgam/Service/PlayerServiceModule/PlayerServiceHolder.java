package org.amalgam.Service.PlayerServiceModule;

/**
* org/amalgam/Service/PlayerServiceModule/PlayerServiceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Monday, May 20, 2024 3:01:01 PM PST
*/

public final class PlayerServiceHolder implements org.omg.CORBA.portable.Streamable
{
  public PlayerService value = null;

  public PlayerServiceHolder ()
  {
  }

  public PlayerServiceHolder (PlayerService initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PlayerServiceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PlayerServiceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PlayerServiceHelper.type ();
  }

}
