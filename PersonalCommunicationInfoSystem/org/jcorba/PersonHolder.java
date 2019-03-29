package org.jcorba;

/**
* org/jcorba/PersonHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��TPerson.idl
* 2019��3��29�� ������ ����02ʱ04��16�� CST
*/

public final class PersonHolder implements org.omg.CORBA.portable.Streamable
{
  public org.jcorba.Person value = null;

  public PersonHolder ()
  {
  }

  public PersonHolder (org.jcorba.Person initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.jcorba.PersonHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.jcorba.PersonHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.jcorba.PersonHelper.type ();
  }

}
