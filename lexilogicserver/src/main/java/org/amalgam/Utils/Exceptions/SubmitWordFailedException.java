package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/SubmitWordFailedException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 2:06:55 AM SGT
*/

public final class SubmitWordFailedException extends org.omg.CORBA.UserException
{
  public String message = null;

  public SubmitWordFailedException ()
  {
    super(SubmitWordFailedExceptionHelper.id());
  } // ctor

  public SubmitWordFailedException (String _message)
  {
    super(SubmitWordFailedExceptionHelper.id());
    message = _message;
  } // ctor


  public SubmitWordFailedException (String $reason, String _message)
  {
    super(SubmitWordFailedExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class SubmitWordFailedException
