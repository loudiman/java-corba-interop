package org.amalgam.Utils.ObjectExceptions;


/**
* org/amalgam/Utils/ObjectExceptions/DuplicatePlayerIDException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramObjects.idl
* Friday, May 3, 2024 11:33:44 PM SGT
*/

public final class DuplicatePlayerIDException extends org.omg.CORBA.UserException
{
  public String reason = null;

  public DuplicatePlayerIDException ()
  {
    super(DuplicatePlayerIDExceptionHelper.id());
  } // ctor

  public DuplicatePlayerIDException (String _reason)
  {
    super(DuplicatePlayerIDExceptionHelper.id());
    reason = _reason;
  } // ctor


  public DuplicatePlayerIDException (String $reason, String _reason)
  {
    super(DuplicatePlayerIDExceptionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class DuplicatePlayerIDException
