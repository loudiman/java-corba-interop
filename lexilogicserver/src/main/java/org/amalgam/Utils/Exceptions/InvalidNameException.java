package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InvalidNameException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 13, 2024 11:20:50 PM SGT
*/

public final class InvalidNameException extends org.omg.CORBA.UserException
{
  public String message = null;

  public InvalidNameException ()
  {
    super(InvalidNameExceptionHelper.id());
  } // ctor

  public InvalidNameException (String _message)
  {
    super(InvalidNameExceptionHelper.id());
    message = _message;
  } // ctor


  public InvalidNameException (String $reason, String _message)
  {
    super(InvalidNameExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class InvalidNameException
