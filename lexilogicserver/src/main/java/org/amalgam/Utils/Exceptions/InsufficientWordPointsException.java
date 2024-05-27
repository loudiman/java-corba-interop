package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InsufficientWordPointsException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, 26 May 2024 00:11:51 o'clock PST
*/

public final class InsufficientWordPointsException extends org.omg.CORBA.UserException
{
  public String message = null;

  public InsufficientWordPointsException ()
  {
    super(InsufficientWordPointsExceptionHelper.id());
  } // ctor

  public InsufficientWordPointsException (String _message)
  {
    super(InsufficientWordPointsExceptionHelper.id());
    message = _message;
  } // ctor


  public InsufficientWordPointsException (String $reason, String _message)
  {
    super(InsufficientWordPointsExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class InsufficientWordPointsException
