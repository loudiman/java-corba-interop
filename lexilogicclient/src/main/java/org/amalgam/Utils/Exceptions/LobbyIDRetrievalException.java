package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/LobbyIDRetrievalException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, June 30, 2024 9:48:44 PM SGT
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
