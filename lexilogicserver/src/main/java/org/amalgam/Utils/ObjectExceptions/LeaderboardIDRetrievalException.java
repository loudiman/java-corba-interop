package org.amalgam.Utils.ObjectExceptions;


/**
* org/amalgam/Utils/ObjectExceptions/LeaderboardIDRetrievalException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramObjects.idl
* Friday, May 3, 2024 11:32:16 PM SGT
*/

public final class LeaderboardIDRetrievalException extends org.omg.CORBA.UserException
{
  public String reason = null;

  public LeaderboardIDRetrievalException ()
  {
    super(LeaderboardIDRetrievalExceptionHelper.id());
  } // ctor

  public LeaderboardIDRetrievalException (String _reason)
  {
    super(LeaderboardIDRetrievalExceptionHelper.id());
    reason = _reason;
  } // ctor


  public LeaderboardIDRetrievalException (String $reason, String _reason)
  {
    super(LeaderboardIDRetrievalExceptionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class LeaderboardIDRetrievalException
