package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/LeaderboardIDRetrievalExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, 26 May 2024 00:11:52 o'clock PST
*/

public final class LeaderboardIDRetrievalExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public LeaderboardIDRetrievalException value = null;

  public LeaderboardIDRetrievalExceptionHolder ()
  {
  }

  public LeaderboardIDRetrievalExceptionHolder (LeaderboardIDRetrievalException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LeaderboardIDRetrievalExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LeaderboardIDRetrievalExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LeaderboardIDRetrievalExceptionHelper.type ();
  }

}
