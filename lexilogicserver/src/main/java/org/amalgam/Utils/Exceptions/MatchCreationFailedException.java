package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/MatchCreationFailedException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, 26 May 2024 00:11:51 o'clock PST
*/

public final class MatchCreationFailedException extends org.omg.CORBA.UserException
{
  public String message = null;

  public MatchCreationFailedException ()
  {
    super(MatchCreationFailedExceptionHelper.id());
  } // ctor

  public MatchCreationFailedException (String _message)
  {
    super(MatchCreationFailedExceptionHelper.id());
    message = _message;
  } // ctor


  public MatchCreationFailedException (String $reason, String _message)
  {
    super(MatchCreationFailedExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class MatchCreationFailedException
