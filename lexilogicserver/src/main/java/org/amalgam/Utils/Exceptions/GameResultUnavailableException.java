package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/GameResultUnavailableException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 13, 2024 11:20:50 PM SGT
*/

public final class GameResultUnavailableException extends org.omg.CORBA.UserException
{
  public String message = null;

  public GameResultUnavailableException ()
  {
    super(GameResultUnavailableExceptionHelper.id());
  } // ctor

  public GameResultUnavailableException (String _message)
  {
    super(GameResultUnavailableExceptionHelper.id());
    message = _message;
  } // ctor


  public GameResultUnavailableException (String $reason, String _message)
  {
    super(GameResultUnavailableExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class GameResultUnavailableException
