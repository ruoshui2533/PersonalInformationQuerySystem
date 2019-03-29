package org.jcorba;


/**
* org/jcorba/NPersonHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从TPerson.idl
* 2019年3月29日 星期五 下午02时04分16秒 CST
*/

abstract public class NPersonHelper
{
  private static String  _id = "IDL:org/jcorba/NPerson:1.0";

  public static void insert (org.omg.CORBA.Any a, org.jcorba.Person[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.jcorba.Person[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.jcorba.PersonHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (org.jcorba.NPersonHelper.id (), "NPerson", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.jcorba.Person[] read (org.omg.CORBA.portable.InputStream istream)
  {
    org.jcorba.Person value[] = null;
    int _len0 = istream.read_long ();
    value = new org.jcorba.Person[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = org.jcorba.PersonHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.jcorba.Person[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      org.jcorba.PersonHelper.write (ostream, value[_i0]);
  }

}
