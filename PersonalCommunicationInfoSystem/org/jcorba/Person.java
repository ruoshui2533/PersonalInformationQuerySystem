package org.jcorba;


/**
* org/jcorba/Person.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��TPerson.idl
* 2019��3��29�� ������ ����02ʱ04��16�� CST
*/

public final class Person implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public String email = null;

  public Person ()
  {
  } // ctor

  public Person (String _name, String _email)
  {
    name = _name;
    email = _email;
  } // ctor

} // class Person
