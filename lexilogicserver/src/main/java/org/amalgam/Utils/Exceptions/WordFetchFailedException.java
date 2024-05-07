package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/WordFetchFailedException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 2:06:55 AM SGT
*/

public final class WordFetchFailedException extends org.omg.CORBA.UserException
{
  public String message = null;

  public WordFetchFailedException ()
  {
    super(WordFetchFailedExceptionHelper.id());
  } // ctor

  public WordFetchFailedException (String _message)
  {
    super(WordFetchFailedExceptionHelper.id());
    message = _message;
  } // ctor


  public WordFetchFailedException (String $reason, String _message)
  {
    super(WordFetchFailedExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class WordFetchFailedException
