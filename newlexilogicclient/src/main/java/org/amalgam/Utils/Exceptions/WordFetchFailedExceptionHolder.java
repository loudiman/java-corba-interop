package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/WordFetchFailedExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 12:45:43 AM SGT
*/

public final class WordFetchFailedExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public WordFetchFailedException value = null;

  public WordFetchFailedExceptionHolder ()
  {
  }

  public WordFetchFailedExceptionHolder (WordFetchFailedException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = WordFetchFailedExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    WordFetchFailedExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return WordFetchFailedExceptionHelper.type ();
  }

}
