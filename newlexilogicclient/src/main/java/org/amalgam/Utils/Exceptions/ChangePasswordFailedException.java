package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/ChangePasswordFailedException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 15, 2024 6:06:35 PM SGT
*/

public final class ChangePasswordFailedException extends org.omg.CORBA.UserException
{
  public String message = null;

  public ChangePasswordFailedException ()
  {
    super(ChangePasswordFailedExceptionHelper.id());
  } // ctor

  public ChangePasswordFailedException (String _message)
  {
    super(ChangePasswordFailedExceptionHelper.id());
    message = _message;
  } // ctor


  public ChangePasswordFailedException (String $reason, String _message)
  {
    super(ChangePasswordFailedExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class ChangePasswordFailedException
