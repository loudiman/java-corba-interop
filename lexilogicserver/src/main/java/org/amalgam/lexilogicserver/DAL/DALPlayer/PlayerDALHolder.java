package org.amalgam.lexilogicserver.DAL.DALPlayer;

/**
* org/amalgam/lexilogicserver/DAL/DALPlayer/PlayerDALHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 12:17:01 AM SGT
*/

public final class PlayerDALHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDAL value = null;

  public PlayerDALHolder ()
  {
  }

  public PlayerDALHolder (org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDAL initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDALHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDALHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDALHelper.type ();
  }

}
