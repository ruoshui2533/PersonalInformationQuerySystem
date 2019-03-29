package org.jcorba;


/**
* org/jcorba/NPersonHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从TPerson.idl
* 2019年3月29日 星期五 下午02时04分16秒 CST
*/

public final class NPersonHolder implements org.omg.CORBA.portable.Streamable
{
  public org.jcorba.Person value[] = null;

  public NPersonHolder ()
  {
  }

  public NPersonHolder (org.jcorba.Person[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.jcorba.NPersonHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.jcorba.NPersonHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.jcorba.NPersonHelper.type ();
  }

}
