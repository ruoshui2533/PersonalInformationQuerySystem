package org.jcorba;


/**
* org/jcorba/TComPOA.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��TPerson.idl
* 2019��3��29�� ������ ����02ʱ04��16�� CST
*/

public abstract class TComPOA extends org.omg.PortableServer.Servant
 implements org.jcorba.TComOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getPersonInfo", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // org/jcorba/TCom/getPersonInfo
       {
         org.jcorba.NPersonHolder persons = new org.jcorba.NPersonHolder ();
         this.getPersonInfo (persons);
         out = $rh.createReply();
         org.jcorba.NPersonHelper.write (out, persons.value);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:org/jcorba/TCom:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public TCom _this() 
  {
    return TComHelper.narrow(
    super._this_object());
  }

  public TCom _this(org.omg.CORBA.ORB orb) 
  {
    return TComHelper.narrow(
    super._this_object(orb));
  }


} // class TComPOA
