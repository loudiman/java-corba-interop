package org.amalgam.lexilogicserver.DAL.DALLeaderBoard.LeaderboardDALPackage;


/**
* org/amalgam/lexilogicserver/DAL/DALLeaderBoard/LeaderboardDALPackage/LeaderboardHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 12:17:01 AM SGT
*/

abstract public class LeaderboardHelper
{
  private static String  _id = "IDL:org/amalgam/lexilogicserver/DAL/DALLeaderBoard/LeaderboardDAL/Leaderboard:1.0";

  public static void insert (org.omg.CORBA.Any a, org.amalgam.lexilogicserver.DAL.DALLeaderBoard.LeaderboardDALPackage.Leaderboard that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.amalgam.lexilogicserver.DAL.DALLeaderBoard.LeaderboardDALPackage.Leaderboard extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "leaderboardID",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[1] = new org.omg.CORBA.StructMember (
            "userID",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[2] = new org.omg.CORBA.StructMember (
            "totalPoints",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (org.amalgam.lexilogicserver.DAL.DALLeaderBoard.LeaderboardDALPackage.LeaderboardHelper.id (), "Leaderboard", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.amalgam.lexilogicserver.DAL.DALLeaderBoard.LeaderboardDALPackage.Leaderboard read (org.omg.CORBA.portable.InputStream istream)
  {
    org.amalgam.lexilogicserver.DAL.DALLeaderBoard.LeaderboardDALPackage.Leaderboard value = new org.amalgam.lexilogicserver.DAL.DALLeaderBoard.LeaderboardDALPackage.Leaderboard ();
    value.leaderboardID = istream.read_long ();
    value.userID = istream.read_long ();
    value.totalPoints = istream.read_long ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.amalgam.lexilogicserver.DAL.DALLeaderBoard.LeaderboardDALPackage.Leaderboard value)
  {
    ostream.write_long (value.leaderboardID);
    ostream.write_long (value.userID);
    ostream.write_long (value.totalPoints);
  }

}
