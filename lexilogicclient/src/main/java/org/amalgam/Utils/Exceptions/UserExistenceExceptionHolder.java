package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/UserExistenceExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Sunday, 26 May 2024 00:11:52 o'clock PST
*/

public final class UserExistenceExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public UserExistenceException value = null;

  public UserExistenceExceptionHolder ()
  {
  }

  public UserExistenceExceptionHolder (UserExistenceException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = UserExistenceExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    UserExistenceExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return UserExistenceExceptionHelper.type ();
  }

}
