package org.amalgam.lexilogicserver.DAL.DALLobby;


/**
* org/amalgam/lexilogicserver/DAL/DALLobby/LobbyDALOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 12:17:01 AM SGT
*/

public interface LobbyDALOperations 
{
  void insertNewLobby (int lobbyId, String createdBy, String winner) throws org.amalgam.lexilogicserver.DAL.SQLExceptions.SQLCreateError;
  org.amalgam.lexilogicserver.DAL.DALLobby.LobbyDALPackage.Lobby getLobbyByID (int lobbyId) throws org.amalgam.lexilogicserver.DAL.SQLExceptions.SQLRetrieveError;
} // interface LobbyDALOperations
