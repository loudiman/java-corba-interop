package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/SubmitWordFailedExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 20, 2024 2:19:22 PM SGT
*/

public final class SubmitWordFailedExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public SubmitWordFailedException value = null;

  public SubmitWordFailedExceptionHolder ()
  {
  }

  public SubmitWordFailedExceptionHolder (SubmitWordFailedException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SubmitWordFailedExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SubmitWordFailedExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SubmitWordFailedExceptionHelper.type ();
  }

}
