package org.amalgam.Utils.UIControllers;

/**
* org/amalgam/Utils/UIControllers/PlayerCallbackHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 2:06:55 AM SGT
*/

public final class PlayerCallbackHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Utils.UIControllers.PlayerCallback value = null;

  public PlayerCallbackHolder ()
  {
  }

  public PlayerCallbackHolder (org.amalgam.Utils.UIControllers.PlayerCallback initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Utils.UIControllers.PlayerCallbackHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Utils.UIControllers.PlayerCallbackHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Utils.UIControllers.PlayerCallbackHelper.type ();
  }

}
