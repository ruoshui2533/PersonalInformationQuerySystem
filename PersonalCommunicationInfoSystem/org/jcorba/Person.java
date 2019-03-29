package org.jcorba;


/**
* org/jcorba/Person.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从TPerson.idl
* 2019年3月29日 星期五 下午02时04分16秒 CST
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
