package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/DuplicateWordException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, June 30, 2024 9:48:44 PM SGT
*/

public final class DuplicateWordException extends org.omg.CORBA.UserException
{
  public String message = null;

  public DuplicateWordException ()
  {
    super(DuplicateWordExceptionHelper.id());
  } // ctor

  public DuplicateWordException (String _message)
  {
    super(DuplicateWordExceptionHelper.id());
    message = _message;
  } // ctor


  public DuplicateWordException (String $reason, String _message)
  {
    super(DuplicateWordExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class DuplicateWordException
