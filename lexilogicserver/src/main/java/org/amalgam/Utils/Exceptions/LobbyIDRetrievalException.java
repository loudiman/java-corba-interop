package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/LobbyIDRetrievalException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, 26 May 2024 00:11:51 o'clock PST
*/

public final class LobbyIDRetrievalException extends org.omg.CORBA.UserException
{
  public String message = null;

  public LobbyIDRetrievalException ()
  {
    super(LobbyIDRetrievalExceptionHelper.id());
  } // ctor

  public LobbyIDRetrievalException (String _message)
  {
    super(LobbyIDRetrievalExceptionHelper.id());
    message = _message;
  } // ctor


  public LobbyIDRetrievalException (String $reason, String _message)
  {
    super(LobbyIDRetrievalExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class LobbyIDRetrievalException
