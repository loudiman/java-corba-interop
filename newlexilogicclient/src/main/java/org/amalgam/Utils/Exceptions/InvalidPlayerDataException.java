package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InvalidPlayerDataException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 20, 2024 3:01:31 PM PST
*/

public final class InvalidPlayerDataException extends org.omg.CORBA.UserException
{
  public String message = null;

  public InvalidPlayerDataException ()
  {
    super(InvalidPlayerDataExceptionHelper.id());
  } // ctor

  public InvalidPlayerDataException (String _message)
  {
    super(InvalidPlayerDataExceptionHelper.id());
    message = _message;
  } // ctor


  public InvalidPlayerDataException (String $reason, String _message)
  {
    super(InvalidPlayerDataExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class InvalidPlayerDataException
