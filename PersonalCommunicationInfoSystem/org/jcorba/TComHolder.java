package org.jcorba;

/**
* org/jcorba/TComHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从TPerson.idl
* 2019年3月29日 星期五 下午02时04分16秒 CST
*/

public final class TComHolder implements org.omg.CORBA.portable.Streamable
{
  public org.jcorba.TCom value = null;

  public TComHolder ()
  {
  }

  public TComHolder (org.jcorba.TCom initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.jcorba.TComHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.jcorba.TComHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.jcorba.TComHelper.type ();
  }

}
