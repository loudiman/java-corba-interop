package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/ObjectExistenceException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 13, 2024 11:16:59 PM SGT
*/

public final class ObjectExistenceException extends org.omg.CORBA.UserException
{
  public String message = null;

  public ObjectExistenceException ()
  {
    super(ObjectExistenceExceptionHelper.id());
  } // ctor

  public ObjectExistenceException (String _message)
  {
    super(ObjectExistenceExceptionHelper.id());
    message = _message;
  } // ctor


  public ObjectExistenceException (String $reason, String _message)
  {
    super(ObjectExistenceExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class ObjectExistenceException
