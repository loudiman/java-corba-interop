package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/CreatedByRetrievalExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, 26 May 2024 00:11:52 o'clock PST
*/

public final class CreatedByRetrievalExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public CreatedByRetrievalException value = null;

  public CreatedByRetrievalExceptionHolder ()
  {
  }

  public CreatedByRetrievalExceptionHolder (CreatedByRetrievalException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CreatedByRetrievalExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CreatedByRetrievalExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CreatedByRetrievalExceptionHelper.type ();
  }

}
