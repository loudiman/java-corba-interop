package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/WinnerDoesNotExistException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 2:06:55 AM SGT
*/

public final class WinnerDoesNotExistException extends org.omg.CORBA.UserException
{
  public String message = null;

  public WinnerDoesNotExistException ()
  {
    super(WinnerDoesNotExistExceptionHelper.id());
  } // ctor

  public WinnerDoesNotExistException (String _message)
  {
    super(WinnerDoesNotExistExceptionHelper.id());
    message = _message;
  } // ctor


  public WinnerDoesNotExistException (String $reason, String _message)
  {
    super(WinnerDoesNotExistExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class WinnerDoesNotExistException
