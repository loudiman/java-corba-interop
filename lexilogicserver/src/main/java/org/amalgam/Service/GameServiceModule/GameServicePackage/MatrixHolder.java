package org.amalgam.Service.GameServiceModule.GameServicePackage;


/**
* org/amalgam/Service/GameServiceModule/GameServicePackage/MatrixHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Sunday, June 30, 2024 9:50:08 PM SGT
*/

public final class MatrixHolder implements org.omg.CORBA.portable.Streamable
{
  public char value[][] = null;

  public MatrixHolder ()
  {
  }

  public MatrixHolder (char[][] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MatrixHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MatrixHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MatrixHelper.type ();
  }

}
