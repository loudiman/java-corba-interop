package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/DuplicatePlayerIDExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, June 30, 2024 9:50:08 PM SGT
*/

public final class DuplicatePlayerIDExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public DuplicatePlayerIDException value = null;

  public DuplicatePlayerIDExceptionHolder ()
  {
  }

  public DuplicatePlayerIDExceptionHolder (DuplicatePlayerIDException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DuplicatePlayerIDExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DuplicatePlayerIDExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DuplicatePlayerIDExceptionHelper.type ();
  }

}
