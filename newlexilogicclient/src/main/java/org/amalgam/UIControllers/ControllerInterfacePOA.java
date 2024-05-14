package org.amalgam.UIControllers;


/**
* org/amalgam/UIControllers/ControllerInterfacePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from UIControllers.idl
* Monday, May 13, 2024 11:16:59 PM SGT
*/

public abstract class ControllerInterfacePOA extends org.omg.PortableServer.Servant
 implements ControllerInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("setObjectsUser", new Integer (0));
    _methods.put ("fetchAndUpdate", new Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    Integer __method = (Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // org/amalgam/UIControllers/ControllerInterface/setObjectsUser
       {
         try {
           String objects = in.read_string ();
           this.setObjectsUser (objects);
           out = $rh.createReply();
         } catch (org.amalgam.ControllerException.InvalidRequestException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.ControllerException.InvalidRequestExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // org/amalgam/UIControllers/ControllerInterface/fetchAndUpdate
       {
         try {
           String jsonString = in.read_string ();
           String dataType = in.read_string ();
           this.fetchAndUpdate (jsonString, dataType);
           out = $rh.createReply();
         } catch (org.amalgam.ControllerException.InvalidRequestException $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.ControllerException.InvalidRequestExceptionHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:org/amalgam/UIControllers/ControllerInterface:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ControllerInterface _this() 
  {
    return ControllerInterfaceHelper.narrow(
    super._this_object());
  }

  public ControllerInterface _this(org.omg.CORBA.ORB orb) 
  {
    return ControllerInterfaceHelper.narrow(
    super._this_object(orb));
  }


} // class ControllerInterfacePOA
