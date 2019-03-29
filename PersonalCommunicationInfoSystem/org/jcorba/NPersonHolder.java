package org.jcorba;


/**
* org/jcorba/NPersonHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��TPerson.idl
* 2019��3��29�� ������ ����02ʱ04��16�� CST
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
