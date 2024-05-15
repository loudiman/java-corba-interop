package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InsufficientWordPointsException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 15, 2024 6:06:37 PM SGT
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
