package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/GameHistoryUnavailableException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 15, 2024 6:06:35 PM SGT
*/

public final class GameHistoryUnavailableException extends org.omg.CORBA.UserException
{
  public String message = null;

  public GameHistoryUnavailableException ()
  {
    super(GameHistoryUnavailableExceptionHelper.id());
  } // ctor

  public GameHistoryUnavailableException (String _message)
  {
    super(GameHistoryUnavailableExceptionHelper.id());
    message = _message;
  } // ctor


  public GameHistoryUnavailableException (String $reason, String _message)
  {
    super(GameHistoryUnavailableExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class GameHistoryUnavailableException
