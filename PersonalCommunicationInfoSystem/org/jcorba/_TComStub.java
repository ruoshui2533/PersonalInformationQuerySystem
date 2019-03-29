package org.jcorba;


/**
* org/jcorba/_TComStub.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��TPerson.idl
* 2019��3��29�� ������ ����02ʱ04��16�� CST
*/

public class _TComStub extends org.omg.CORBA.portable.ObjectImpl implements org.jcorba.TCom
{

  public void getPersonInfo (org.jcorba.NPersonHolder persons)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getPersonInfo", true);
                $in = _invoke ($out);
                persons.value = org.jcorba.NPersonHelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                getPersonInfo (persons        );
            } finally {
                _releaseReply ($in);
            }
  } // getPersonInfo

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:org/jcorba/TCom:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _TComStub
