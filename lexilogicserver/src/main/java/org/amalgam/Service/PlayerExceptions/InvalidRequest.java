package org.amalgam.Service.PlayerExceptions;


/**
* org/amalgam/Service/PlayerExceptions/InvalidRequest.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Friday, May 3, 2024 11:29:23 PM SGT
*/

public final class InvalidRequest extends org.omg.CORBA.UserException
{
  public String message = null;

  public InvalidRequest ()
  {
    super(InvalidRequestHelper.id());
  } // ctor

  public InvalidRequest (String _message)
  {
    super(InvalidRequestHelper.id());
    message = _message;
  } // ctor


  public InvalidRequest (String $reason, String _message)
  {
    super(InvalidRequestHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class InvalidRequest
