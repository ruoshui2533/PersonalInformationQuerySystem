package org.jcorba;


/**
* org/jcorba/TComHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从TPerson.idl
* 2019年3月29日 星期五 下午02时04分16秒 CST
*/

abstract public class TComHelper
{
  private static String  _id = "IDL:org/jcorba/TCom:1.0";

  public static void insert (org.omg.CORBA.Any a, org.jcorba.TCom that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.jcorba.TCom extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.jcorba.TComHelper.id (), "TCom");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.jcorba.TCom read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_TComStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.jcorba.TCom value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static org.jcorba.TCom narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.jcorba.TCom)
      return (org.jcorba.TCom)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.jcorba._TComStub stub = new org.jcorba._TComStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static org.jcorba.TCom unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.jcorba.TCom)
      return (org.jcorba.TCom)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.jcorba._TComStub stub = new org.jcorba._TComStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
