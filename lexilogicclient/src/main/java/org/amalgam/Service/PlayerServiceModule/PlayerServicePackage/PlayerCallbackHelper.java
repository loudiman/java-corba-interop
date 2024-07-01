package org.amalgam.Service.PlayerServiceModule.PlayerServicePackage;


/**
* org/amalgam/Service/PlayerServiceModule/PlayerServicePackage/PlayerCallbackHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Sunday, June 30, 2024 9:48:43 PM SGT
*/

abstract public class PlayerCallbackHelper
{
  private static String  _id = "IDL:org/amalgam/Service/PlayerServiceModule/PlayerService/PlayerCallback:1.0";

  public static void insert (org.omg.CORBA.Any a, org.amalgam.UIControllers.PlayerCallback that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.amalgam.UIControllers.PlayerCallback extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.amalgam.UIControllers.PlayerCallbackHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (PlayerCallbackHelper.id (), "PlayerCallback", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.amalgam.UIControllers.PlayerCallback read (org.omg.CORBA.portable.InputStream istream)
  {
    org.amalgam.UIControllers.PlayerCallback value = null;
    value = org.amalgam.UIControllers.PlayerCallbackHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.amalgam.UIControllers.PlayerCallback value)
  {
    org.amalgam.UIControllers.PlayerCallbackHelper.write (ostream, value);
  }

}
