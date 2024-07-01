package org.amalgam.Service.GameServiceModule.GameServicePackage;


/**
* org/amalgam/Service/GameServiceModule/GameServicePackage/MatrixHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Sunday, June 30, 2024 9:48:43 PM SGT
*/

abstract public class MatrixHelper
{
  private static String  _id = "IDL:org/amalgam/Service/GameServiceModule/GameService/Matrix:1.0";

  public static void insert (org.omg.CORBA.Any a, char[][] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static char[][] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_char);
      __typeCode = org.omg.CORBA.ORB.init ().create_array_tc (6, __typeCode );
      __typeCode = org.omg.CORBA.ORB.init ().create_array_tc (6, __typeCode );
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (MatrixHelper.id (), "Matrix", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static char[][] read (org.omg.CORBA.portable.InputStream istream)
  {
    char value[][] = null;
    value = new char[6][];
    for (int _o0 = 0;_o0 < (6); ++_o0)
    {
      value[_o0] = new char[6];
      for (int _o1 = 0;_o1 < (6); ++_o1)
      {
        value[_o0][_o1] = istream.read_char ();
      }
    }
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, char[][] value)
  {
    if (value.length != (6))
      throw new org.omg.CORBA.MARSHAL (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    for (int _i0 = 0;_i0 < (6); ++_i0)
    {
      if (value[_i0].length != (6))
        throw new org.omg.CORBA.MARSHAL (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
      for (int _i1 = 0;_i1 < (6); ++_i1)
      {
        ostream.write_char (value[_i0][_i1]);
      }
    }
  }

}
