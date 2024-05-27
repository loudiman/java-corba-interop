package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/SQLError.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, 26 May 2024 00:11:51 o'clock PST
*/

public final class SQLError extends org.omg.CORBA.UserException
{
  public String message = null;

  public SQLError ()
  {
    super(SQLErrorHelper.id());
  } // ctor

  public SQLError (String _message)
  {
    super(SQLErrorHelper.id());
    message = _message;
  } // ctor


  public SQLError (String $reason, String _message)
  {
    super(SQLErrorHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class SQLError
