package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/DeleteAccountFailedException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, 26 May 2024 00:11:51 o'clock PST
*/

public final class DeleteAccountFailedException extends org.omg.CORBA.UserException
{
  public String message = null;

  public DeleteAccountFailedException ()
  {
    super(DeleteAccountFailedExceptionHelper.id());
  } // ctor

  public DeleteAccountFailedException (String _message)
  {
    super(DeleteAccountFailedExceptionHelper.id());
    message = _message;
  } // ctor


  public DeleteAccountFailedException (String $reason, String _message)
  {
    super(DeleteAccountFailedExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class DeleteAccountFailedException
