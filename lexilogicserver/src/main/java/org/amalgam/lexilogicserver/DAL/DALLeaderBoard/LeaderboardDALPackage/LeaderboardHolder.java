package org.amalgam.lexilogicserver.DAL.DALLeaderBoard.LeaderboardDALPackage;

/**
* org/amalgam/lexilogicserver/DAL/DALLeaderBoard/LeaderboardDALPackage/LeaderboardHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 12:17:01 AM SGT
*/

public final class LeaderboardHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.lexilogicserver.DAL.DALLeaderBoard.LeaderboardDALPackage.Leaderboard value = null;

  public LeaderboardHolder ()
  {
  }

  public LeaderboardHolder (org.amalgam.lexilogicserver.DAL.DALLeaderBoard.LeaderboardDALPackage.Leaderboard initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.lexilogicserver.DAL.DALLeaderBoard.LeaderboardDALPackage.LeaderboardHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.lexilogicserver.DAL.DALLeaderBoard.LeaderboardDALPackage.LeaderboardHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.lexilogicserver.DAL.DALLeaderBoard.LeaderboardDALPackage.LeaderboardHelper.type ();
  }

}
