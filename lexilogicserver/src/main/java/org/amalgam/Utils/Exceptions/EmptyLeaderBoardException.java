package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/EmptyLeaderBoardException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, 26 May 2024 00:11:51 o'clock PST
*/

public final class EmptyLeaderBoardException extends org.omg.CORBA.UserException
{
  public String message = null;

  public EmptyLeaderBoardException ()
  {
    super(EmptyLeaderBoardExceptionHelper.id());
  } // ctor

  public EmptyLeaderBoardException (String _message)
  {
    super(EmptyLeaderBoardExceptionHelper.id());
    message = _message;
  } // ctor


  public EmptyLeaderBoardException (String $reason, String _message)
  {
    super(EmptyLeaderBoardExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class EmptyLeaderBoardException
