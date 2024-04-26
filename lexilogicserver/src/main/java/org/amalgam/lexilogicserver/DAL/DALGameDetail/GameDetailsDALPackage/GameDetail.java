package org.amalgam.lexilogicserver.DAL.DALGameDetail.GameDetailsDALPackage;


/**
* org/amalgam/lexilogicserver/DAL/DALGameDetail/GameDetailsDALPackage/GameDetail.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 12:17:01 AM SGT
*/

public final class GameDetail implements org.omg.CORBA.portable.IDLEntity
{
  public int playerID = (int)0;
  public int lobbyID = (int)0;
  public int totalPoints = (int)0;

  public GameDetail ()
  {
  } // ctor

  public GameDetail (int _playerID, int _lobbyID, int _totalPoints)
  {
    playerID = _playerID;
    lobbyID = _lobbyID;
    totalPoints = _totalPoints;
  } // ctor

} // class GameDetail
