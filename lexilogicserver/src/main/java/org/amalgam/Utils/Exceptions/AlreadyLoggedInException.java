package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/AlreadyLoggedInException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Thursday, May 9, 2024 1:16:39 PM SGT
*/

public final class AlreadyLoggedInException extends org.omg.CORBA.UserException
{
  public String message = null;

  public AlreadyLoggedInException ()
  {
    super(AlreadyLoggedInExceptionHelper.id());
  } // ctor

  public AlreadyLoggedInException (String _message)
  {
    super(AlreadyLoggedInExceptionHelper.id());
    message = _message;
  } // ctor


  public AlreadyLoggedInException (String $reason, String _message)
  {
    super(AlreadyLoggedInExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class AlreadyLoggedInException
