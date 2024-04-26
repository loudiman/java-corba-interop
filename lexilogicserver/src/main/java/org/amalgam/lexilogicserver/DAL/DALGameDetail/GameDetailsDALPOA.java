package org.amalgam.lexilogicserver.DAL.DALGameDetail;


/**
* org/amalgam/lexilogicserver/DAL/DALGameDetail/GameDetailsDALPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 12:17:01 AM SGT
*/

public abstract class GameDetailsDALPOA extends org.omg.PortableServer.Servant
 implements org.amalgam.lexilogicserver.DAL.DALGameDetail.GameDetailsDALOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertNewGameDetail", new java.lang.Integer (0));
    _methods.put ("getGameDetailByID", new java.lang.Integer (1));
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
       case 0:  // org/amalgam/lexilogicserver/DAL/DALGameDetail/GameDetailsDAL/insertNewGameDetail
       {
         try {
           int playerID = in.read_long ();
           int lobbyID = in.read_long ();
           int totalPoints = in.read_long ();
           this.insertNewGameDetail (playerID, lobbyID, totalPoints);
           out = $rh.createReply();
         } catch (org.amalgam.lexilogicserver.DAL.SQLExceptions.SQLCreateError $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.lexilogicserver.DAL.SQLExceptions.SQLCreateErrorHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // org/amalgam/lexilogicserver/DAL/DALGameDetail/GameDetailsDAL/getGameDetailByID
       {
         try {
           int lobbyID = in.read_long ();
           org.amalgam.lexilogicserver.DAL.DALGameDetail.GameDetailsDALPackage.GameDetail $result = null;
           $result = this.getGameDetailByID (lobbyID);
           out = $rh.createReply();
           org.amalgam.lexilogicserver.DAL.DALGameDetail.GameDetailsDALPackage.GameDetailHelper.write (out, $result);
         } catch (org.amalgam.lexilogicserver.DAL.SQLExceptions.SQLRetrieveError $ex) {
           out = $rh.createExceptionReply ();
           org.amalgam.lexilogicserver.DAL.SQLExceptions.SQLRetrieveErrorHelper.write (out, $ex);
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
    "IDL:org/amalgam/lexilogicserver/DAL/DALGameDetail/GameDetailsDAL:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public GameDetailsDAL _this() 
  {
    return GameDetailsDALHelper.narrow(
    super._this_object());
  }

  public GameDetailsDAL _this(org.omg.CORBA.ORB orb) 
  {
    return GameDetailsDALHelper.narrow(
    super._this_object(orb));
  }


} // class GameDetailsDALPOA
