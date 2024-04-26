package org.amalgam.lexilogicserver.DAL.SQLExceptions;


/**
* org/amalgam/lexilogicserver/DAL/SQLExceptions/SQLDeleteError.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 12:17:01 AM SGT
*/

public final class SQLDeleteError extends org.omg.CORBA.UserException
{
  public String reason = null;

  public SQLDeleteError ()
  {
    super(SQLDeleteErrorHelper.id());
  } // ctor

  public SQLDeleteError (String _reason)
  {
    super(SQLDeleteErrorHelper.id());
    reason = _reason;
  } // ctor


  public SQLDeleteError (String $reason, String _reason)
  {
    super(SQLDeleteErrorHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class SQLDeleteError
