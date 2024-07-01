package org.amalgam.UIControllers;


/**
* org/amalgam/UIControllers/MatchmakeCallbackPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from UIControllers.idl
* Sunday, June 30, 2024 9:48:44 PM SGT
*/

public abstract class MatchmakeCallbackPOA extends org.omg.PortableServer.Servant
 implements MatchmakeCallbackOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_username", new Integer (0));
    _methods.put ("_set_username", new Integer (1));
    _methods.put ("joiningCall", new Integer (2));
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
       case 0:  // org/amalgam/UIControllers/MatchmakeCallback/_get_username
       {
         String $result = null;
         $result = this.username ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // org/amalgam/UIControllers/MatchmakeCallback/_set_username
       {
         String newUsername = in.read_string ();
         this.username (newUsername);
         out = $rh.createReply();
         break;
       }

       case 2:  // org/amalgam/UIControllers/MatchmakeCallback/joiningCall
       {
         try {
           String jsonString = in.read_string ();
           this.joiningCall (jsonString);
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
    "IDL:org/amalgam/UIControllers/MatchmakeCallback:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public MatchmakeCallback _this() 
  {
    return MatchmakeCallbackHelper.narrow(
    super._this_object());
  }

  public MatchmakeCallback _this(org.omg.CORBA.ORB orb) 
  {
    return MatchmakeCallbackHelper.narrow(
    super._this_object(orb));
  }


} // class MatchmakeCallbackPOA
