package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InvalidWordFormatException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 29, 2024 9:39:27 PM PST
*/

public final class InvalidWordFormatException extends org.omg.CORBA.UserException
{
  public String message = null;

  public InvalidWordFormatException ()
  {
    super(InvalidWordFormatExceptionHelper.id());
  } // ctor

  public InvalidWordFormatException (String _message)
  {
    super(InvalidWordFormatExceptionHelper.id());
    message = _message;
  } // ctor


  public InvalidWordFormatException (String $reason, String _message)
  {
    super(InvalidWordFormatExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class InvalidWordFormatException
