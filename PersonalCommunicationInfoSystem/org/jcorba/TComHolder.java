package org.jcorba;

/**
* org/jcorba/TComHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��TPerson.idl
* 2019��3��29�� ������ ����02ʱ04��16�� CST
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
