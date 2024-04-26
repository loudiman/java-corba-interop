package org.amalgam.lexilogicserver.DAL.DALPlayer;


/**
* org/amalgam/lexilogicserver/DAL/DALPlayer/PlayerDALHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 12:17:01 AM SGT
*/

abstract public class PlayerDALHelper
{
  private static String  _id = "IDL:org/amalgam/lexilogicserver/DAL/DALPlayer/PlayerDAL:1.0";

  public static void insert (org.omg.CORBA.Any a, org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDAL that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDAL extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDALHelper.id (), "PlayerDAL");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDAL read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_PlayerDALStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDAL value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDAL narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDAL)
      return (org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDAL)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.amalgam.lexilogicserver.DAL.DALPlayer._PlayerDALStub stub = new org.amalgam.lexilogicserver.DAL.DALPlayer._PlayerDALStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDAL unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDAL)
      return (org.amalgam.lexilogicserver.DAL.DALPlayer.PlayerDAL)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.amalgam.lexilogicserver.DAL.DALPlayer._PlayerDALStub stub = new org.amalgam.lexilogicserver.DAL.DALPlayer._PlayerDALStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
