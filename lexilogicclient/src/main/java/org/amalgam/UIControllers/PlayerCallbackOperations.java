package org.amalgam.UIControllers;


/**
* org/amalgam/UIControllers/PlayerCallbackOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from UIControllers.idl
* Sunday, June 30, 2024 9:48:44 PM SGT
*/

public interface PlayerCallbackOperations 
{
  String username ();
  void username (String newUsername);
  void uiCall (String jsonString) throws org.amalgam.ControllerException.InvalidRequestException;
} // interface PlayerCallbackOperations
