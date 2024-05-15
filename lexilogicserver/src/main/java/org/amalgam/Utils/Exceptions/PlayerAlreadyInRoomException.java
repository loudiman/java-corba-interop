package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/PlayerAlreadyInRoomException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 15, 2024 6:06:37 PM SGT
*/

public final class PlayerAlreadyInRoomException extends org.omg.CORBA.UserException
{
  public String message = null;

  public PlayerAlreadyInRoomException ()
  {
    super(PlayerAlreadyInRoomExceptionHelper.id());
  } // ctor

  public PlayerAlreadyInRoomException (String _message)
  {
    super(PlayerAlreadyInRoomExceptionHelper.id());
    message = _message;
  } // ctor


  public PlayerAlreadyInRoomException (String $reason, String _message)
  {
    super(PlayerAlreadyInRoomExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class PlayerAlreadyInRoomException
