package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/RoomDoesNotExistException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, June 30, 2024 9:48:44 PM SGT
*/

public final class RoomDoesNotExistException extends org.omg.CORBA.UserException
{
  public String message = null;

  public RoomDoesNotExistException ()
  {
    super(RoomDoesNotExistExceptionHelper.id());
  } // ctor

  public RoomDoesNotExistException (String _message)
  {
    super(RoomDoesNotExistExceptionHelper.id());
    message = _message;
  } // ctor


  public RoomDoesNotExistException (String $reason, String _message)
  {
    super(RoomDoesNotExistExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class RoomDoesNotExistException
